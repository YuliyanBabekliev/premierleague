const newsId = document.getElementById('newsId').value

const csrfHeaderName = document.head.querySelector('[name="_csrf_header"]').content;
const csrfHeaderValue = document.head.querySelector('[name="_csrf"]').content;

const commentsContainer = document.getElementById('comments-container')

const allComments = []

const commentForm = document.getElementById('commentForm')
commentForm.addEventListener("submit", handleCommentSubmit)

const displayComments = (comments) => {
    commentsContainer.innerHTML = comments.map(
        (c)=> {
            return asComment(c)
        }
    ).join('')
}

async function handleCommentSubmit(event) {
    event.preventDefault();

    const form = event.currentTarget;
    const url = form.action;
    const formData = new FormData(form);
    console.log(Array.from(formData))

    try {
        const responseData = await postFormDataAsJson({url, formData});

        commentsContainer.insertAdjacentHTML("afterbegin", asComment(responseData));

        form.reset();
    } catch (error) {

        let errorObj = JSON.parse(error.message);

        if (errorObj.fieldWithErrors) {
            errorObj.fieldWithErrors.forEach(
                e => {
                    let elementWithError = document.getElementById(e);
                    if (elementWithError) {
                        elementWithError.classList.add("is-invalid");
                    }
                }

            )
        }

    }
    console.log('going to submit a comment!')
}

async function postFormDataAsJson({url, formData}) {

    const plainFormData = Object.fromEntries(formData.entries());
    const formDataAsJSONString = JSON.stringify(plainFormData);

    const fetchOptions = {
        method: "POST",
        headers: {
            [csrfHeaderName] : csrfHeaderValue,
            "Content-Type" : "application/json",
            "Accept" :"application/json"
        },
        body: formDataAsJSONString
    }
    const response = await fetch(url, fetchOptions);
    console.log(response)

    if (!response.ok) {
        const errorMessage = await response.text();
        throw new Error(errorMessage);
    }

    return response.json();
}

function asComment(c) {
    let commentHtml = `<div class="user-comment" id="user-comment">`


    commentHtml += `<div class="user-photo-container">
            <img src="${c.imgUrl}" alt="" />
        </div>`
    commentHtml += `<div class="comment-container" id="commentCntr-${c.id}">`
    commentHtml += `<h3>${c.user}</h3><br/>`
    commentHtml += `<p>${c.commentText}</p>`
    commentHtml += `<p>${c.date}</p>`
    commentHtml += `</div>`
    commentHtml += `</div>`

    return commentHtml
}

fetch(`http://localhost:8080/api/v1/${newsId}/comments`).
then(response => response.json()).
then(data => {
    for (let comment of data) {
        allComments.push(comment)
    }
    displayComments(allComments)
})
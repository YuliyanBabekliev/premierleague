const newsId = document.getElementById('newsId').value

const commentsContainer = document.getElementById('comments-container')

const allComments = []

const displayComments = (comments) => {
    commentsContainer.innerHTML = comments.map(
        (c)=> {
            return asComment(c)
        }
    ).join('')
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
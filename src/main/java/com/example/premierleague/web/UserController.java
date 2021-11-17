package com.example.premierleague.web;

import com.example.premierleague.models.binding.CloudinaryImage;
import com.example.premierleague.models.binding.PictureBindingModel;
import com.example.premierleague.models.binding.UserLoginBindingModel;
import com.example.premierleague.models.binding.UserRegisterBindingModel;
import com.example.premierleague.models.entities.Picture;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.service.UserServiceModel;
import com.example.premierleague.models.view.UserProfileViewModel;
import com.example.premierleague.services.CloudinaryService;
import com.example.premierleague.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.io.IOException;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final ModelMapper modelMapper;
    private final CloudinaryService cloudinaryService;

    public UserController(UserService userService, ModelMapper modelMapper, CloudinaryService cloudinaryService) {
        this.userService = userService;
        this.modelMapper = modelMapper;
        this.cloudinaryService = cloudinaryService;
    }

    @ModelAttribute
    public UserRegisterBindingModel userRegisterBindingModel(){
        return new UserRegisterBindingModel();
    }

    @ModelAttribute
    public UserLoginBindingModel userLoginBindingModel(){
        return new UserLoginBindingModel();
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @GetMapping("/profile")
    public String profile(Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        UserProfileViewModel user = this.userService.findUserProfileByUsername(username);
        model.addAttribute("user", user);
        return "profile";
    }

    @PostMapping("profile/add-picture")
    public String addPicture(PictureBindingModel pictureBindingModel) throws IOException {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        User user = this.userService.findUserByUsername(username);

        Picture picture = createPictureEntity(pictureBindingModel.getPicture(), pictureBindingModel.getTitle(), user);

        this.cloudinaryService.savePictureInDB(picture);
        this.userService.editUserProfileImage(user, picture);

        return "redirect:/users/profile";
    }

    private Picture createPictureEntity(MultipartFile file, String title, User user) throws IOException {

        CloudinaryImage uploaded = cloudinaryService.upload(file);
        Picture picture = new Picture();
        picture.setPublicID(uploaded.getPublicId());
        picture.setUrl(uploaded.getUrl());
        picture.setTitle(title);
        picture.setUser(user);
        return picture;
    }

    @PostMapping("/register")
    public String registerConfirm(@Valid UserRegisterBindingModel userRegisterBindingModel, BindingResult bindingResult,
                                  RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("userRegisterBindingModel", userRegisterBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userRegisterBindingModel", bindingResult);
            return "redirect:register";
        }

        if(this.userService.findUserByUsername(userRegisterBindingModel.getUsername()) != null){
            redirectAttributes.addFlashAttribute("invalidUsername", true);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userRegisterBindingModel", bindingResult);
            return "redirect:register";
        }

        if(!userRegisterBindingModel.getPassword().equals(userRegisterBindingModel.getConfirmPassword())){
            redirectAttributes.addFlashAttribute("notEqualPasswords", true);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userRegisterBindingModel", bindingResult);
            return "redirect:register";
        }

        this.userService.registerAndLoginUser(this.modelMapper.map(userRegisterBindingModel, UserServiceModel.class));
        return "redirect:/";
    }

    @PostMapping("/login-error")
    public String failedLogin(@ModelAttribute(UsernamePasswordAuthenticationFilter.SPRING_SECURITY_FORM_USERNAME_KEY)
                              String username, RedirectAttributes redirectAttributes){

        redirectAttributes.addFlashAttribute("bad_credentials", true);
        redirectAttributes.addFlashAttribute("username", username);
        return "redirect:/users/login";
    }
}

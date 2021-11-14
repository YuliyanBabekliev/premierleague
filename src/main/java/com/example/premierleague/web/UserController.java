package com.example.premierleague.web;

import com.example.premierleague.models.binding.UserLoginBindingModel;
import com.example.premierleague.models.binding.UserRegisterBindingModel;
import com.example.premierleague.models.service.UserServiceModel;
import com.example.premierleague.models.view.UserProfileViewModel;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final ModelMapper modelMapper;

    public UserController(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
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

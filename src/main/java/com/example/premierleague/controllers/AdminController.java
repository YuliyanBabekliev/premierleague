package com.example.premierleague.controllers;

import com.example.premierleague.models.binding.AdminAddPlayerBindingModel;
import com.example.premierleague.models.binding.AdminAddRoleBindingModel;
import com.example.premierleague.models.entities.Role;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.entities.enums.RoleNameEnum;
import com.example.premierleague.services.AdminService;
import com.example.premierleague.services.PlayerService;
import com.example.premierleague.services.RoleService;
import com.example.premierleague.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;
    private final UserService userService;
    private final RoleService roleService;
    private final PlayerService playerService;

    public AdminController(AdminService adminService, UserService userService, RoleService roleService, PlayerService playerService) {
        this.adminService = adminService;
        this.userService = userService;
        this.roleService = roleService;
        this.playerService = playerService;
    }

    @ModelAttribute()
    public AdminAddRoleBindingModel adminAddRoleBindingModel(){
        return new AdminAddRoleBindingModel();
    }

    @ModelAttribute()
    public AdminAddPlayerBindingModel adminAddPlayerBindingModel(){
        return new AdminAddPlayerBindingModel();
    }
    @GetMapping("/add-role")
    public String adminAddRole(Model model){
        List<User> users = this.userService.findAllUsers();
        model.addAttribute("users", users);
        return "admin-add-role";
    }

    @PostMapping("/add-role")
    public String addRoleConfirm(@Valid AdminAddRoleBindingModel adminAddRoleBindingModel, BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("adminAddRoleBindingModel", adminAddRoleBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userLoginBindingModel", bindingResult);
            return "redirect:/admin/add-role";
        }
        List<Role> roles = this.roleService.findAllRoles();
        User user = this.userService.findUserByUsername(adminAddRoleBindingModel.getUsername());
        if(adminAddRoleBindingModel.getRole().equals(RoleNameEnum.ADMIN)) {
            this.userService.setUserAdminRole(user);
        }else{
            this.userService.setUserRole(user);
        }
        return "redirect:/";
    }

    @GetMapping("/add-news")
    public String adminAddNews(){
        return "admin-add-news";
    }

    @GetMapping("/add-statistics")
    public String adminAddStatistics(){
        return "admin-add-statistics";
    }

    @GetMapping("/add-players")
    public String adminAddPlayers(){
        return "admin-add-players";
    }

    @PostMapping("/add-players")
    public String addPlayersConfirm(@Valid AdminAddPlayerBindingModel adminAddPlayerBindingModel,
                                    BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("adminAddPlayerBindingModel", adminAddPlayerBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userLoginBindingModel", bindingResult);
            return "redirect:/admin/add-players";
        }
        this.playerService.addPlayer(adminAddPlayerBindingModel);
        return "redirect:/";
    }
}

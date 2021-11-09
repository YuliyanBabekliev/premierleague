package com.example.premierleague.controllers;

import com.example.premierleague.models.binding.*;
import com.example.premierleague.models.entities.Role;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.entities.enums.RoleNameEnum;
import com.example.premierleague.models.service.GameServiceModel;
import com.example.premierleague.services.*;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
    private final UserService userService;
    private final RoleService roleService;
    private final PlayerService playerService;
    private final NewsService newsService;
    private final TeamService teamService;
    private final GameService gameService;
    private final ModelMapper modelMapper;

    public AdminController(UserService userService, RoleService roleService, PlayerService playerService, NewsService newsService, TeamService teamService, GameService gameService, ModelMapper modelMapper) {
        this.userService = userService;
        this.roleService = roleService;
        this.playerService = playerService;
        this.newsService = newsService;
        this.teamService = teamService;
        this.gameService = gameService;
        this.modelMapper = modelMapper;
    }

    @ModelAttribute()
    public AdminAddRoleBindingModel adminAddRoleBindingModel(){
        return new AdminAddRoleBindingModel();
    }

    @ModelAttribute()
    public AdminAddPlayerBindingModel adminAddPlayerBindingModel(){
        return new AdminAddPlayerBindingModel();
    }

    @ModelAttribute()
    public AdminAddNewsBindingModel adminAddNewsBindingModel(){
        return new AdminAddNewsBindingModel();
    }

    @ModelAttribute()
    public AdminEditStatisticsBindingModel adminEditStatisticsBindingModel(){
        return new AdminEditStatisticsBindingModel();
    }

    @ModelAttribute()
    public AdminAddMatchesBindingModel adminAddMatchesBindingModel(){
        return new AdminAddMatchesBindingModel();
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
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.adminAddRoleBindingModel", bindingResult);
            return "redirect:/admin/add-role";
        }
        List<Role> roles = this.roleService.findAllRoles();
        User user = this.userService.findUserByUsername(adminAddRoleBindingModel.getUsername());
        if(adminAddRoleBindingModel.getRole().equals(RoleNameEnum.ADMIN.name())) {
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

    @PostMapping("/add-news")
    public String addNewsConfirm(@Valid AdminAddNewsBindingModel adminAddNewsBindingModel,
                                 BindingResult bindingResult, RedirectAttributes redirectAttributes){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        User user = this.userService.findUserByUsername(username);
        if(bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("adminAddNewsBindingModel", adminAddNewsBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.adminAddNewsBindingModel", bindingResult);
            return "redirect:/admin/add-news";
        }
        this.newsService.addNews(adminAddNewsBindingModel, user);
        return "redirect:/";
    }

    @GetMapping("/edit-statistics")
    public String adminEditStatistics(){
        return "admin-edit-statistics";
    }

    @PostMapping("/edit-statistics")
    public String editStatisticsConfirm(@Valid AdminEditStatisticsBindingModel adminEditStatisticsBindingModel,
                                        BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("adminEditStatisticsBindingModel", adminEditStatisticsBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.adminEditStatisticsBindingModel", bindingResult);
            return "redirect:/admin/edit-statistics";
        }

        this.teamService.editTeamStatistics(adminEditStatisticsBindingModel);
        return "redirect:/";
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
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.adminAddPlayerBindingModel", bindingResult);
            return "redirect:/admin/add-players";
        }
        this.playerService.addPlayer(adminAddPlayerBindingModel);
        return "redirect:/";
    }

    @GetMapping("/add-matches")
    public String adminAddMatches(){
        return "admin-add-matches";
    }

    @PostMapping("/add-matches")
    public String addMatchesConfirm(@Valid AdminAddMatchesBindingModel adminAddMatchesBindingModel,
                                    BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("adminAddMatchesBindingModel", adminAddMatchesBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.adminAddMatchesBindingModel", bindingResult);
            return "redirect:/admin/add-matches";
        }

        GameServiceModel gameServiceModel = this.modelMapper.map(adminAddMatchesBindingModel, GameServiceModel.class);
        gameServiceModel.setHomeTeam(this.teamService.findTeamByName(adminAddMatchesBindingModel.getHomeTeam()));
        gameServiceModel.setAwayTeam(this.teamService.findTeamByName(adminAddMatchesBindingModel.getAwayTeam()));
        gameServiceModel.setDate(adminAddMatchesBindingModel.getDate());
        this.gameService.addGame(gameServiceModel);
        return "redirect:/";
    }
}

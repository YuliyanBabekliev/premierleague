package com.example.premierleague.models.binding;

import com.example.premierleague.models.entities.enums.RoleNameEnum;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AdminAddRoleBindingModel {
    private String username;
    private String role;

    @Size(min = 1, message = "User cannot be empty!")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Size(min = 1, message = "Role cannot be empty!")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

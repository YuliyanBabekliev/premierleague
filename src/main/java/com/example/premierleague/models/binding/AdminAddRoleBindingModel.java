package com.example.premierleague.models.binding;

import com.example.premierleague.models.entities.enums.RoleNameEnum;

import javax.validation.constraints.NotNull;

public class AdminAddRoleBindingModel {
    private String username;
    private RoleNameEnum role;

    @NotNull
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NotNull
    public RoleNameEnum getRole() {
        return role;
    }

    public void setRole(RoleNameEnum role) {
        this.role = role;
    }
}

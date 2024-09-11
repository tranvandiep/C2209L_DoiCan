/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gokisoft.products.forms;

import jakarta.validation.constraints.NotNull;
import java.io.Serializable;

/**
 *
 * @author dieptv
 */
public class LoginForm implements Serializable{
    @NotNull(message = "Email is not null")
    private String email;
    @NotNull(message = "Password is not null")
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

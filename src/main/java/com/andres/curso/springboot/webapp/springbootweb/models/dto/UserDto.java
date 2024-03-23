package com.andres.curso.springboot.webapp.springbootweb.models.dto;

import com.andres.curso.springboot.webapp.springbootweb.models.User;

public class UserDto {

    private String titulo;
    private User user;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    
}

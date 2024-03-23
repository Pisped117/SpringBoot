package com.andres.curso.springboot.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.andres.curso.springboot.webapp.springbootweb.models.User;

@Controller
public class UserController {

    @GetMapping("/holaMundo")
    public String holaMundo(Map<String, Object> model) {

        User user = new User("Andres", "Alvarez");
        model.put("titulo", "Spring Boot App");
        model.put("user", user);
        return "holaMundo";
    }

    @GetMapping("/listar")
    public String lista(ModelMap modelMap) {
        modelMap.addAttribute("titulo", "Mi aplicacion en spring boot");
        return "listar";

    }

    @ModelAttribute("usuarios")
    public List<User> listaUsers() {
        return Arrays.asList(
                new User("Andres", "Alvarez"),
                new User("Juan", "Alvarez", "juanpolo@gmail.com"),
                new User("Holman", "Avila"),
                new User("Ana", "Alvarez", "ana@gmail.com"));
    }

}

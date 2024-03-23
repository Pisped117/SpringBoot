package com.andres.curso.springboot.webapp.springbootweb.controllers;


//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andres.curso.springboot.webapp.springbootweb.models.User;
import com.andres.curso.springboot.webapp.springbootweb.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

 @GetMapping("/holaMundoRestDto")
public UserDto holaMundoRest(){
    UserDto userDto = new UserDto();
    User user = new User("Andres", "Alvarez");
    userDto.setUser(user);
    userDto.setTitulo("Hola Mundo en spring boot");
    return userDto;
}

@GetMapping("/lista")
public List<User> list(){

    User user = new User("Andres", "Alvarez");
    User user2 = new User("Juan", "Avila");
    User user3 = new User("Holman", "Perez");

    List<User> usuarios = Arrays.asList(user, user2, user3);//

    // usuarios.add(user);
    // usuarios.add(user2);
    // usuarios.add(user3);

    return usuarios;
}

@GetMapping("/holaMundoRest")
public Map<String, Object> holaMundoRest2(){
    User user = new User("Andres", "Alvarez");
    Map<String, Object> response = new HashMap<>();
    response.put("titulo", "Spring Boot App");
    response.put("user", user);
    return response;
}
}

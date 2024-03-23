package com.andres.curso.springboot.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andres.curso.springboot.webapp.springbootweb.models.User;
import com.andres.curso.springboot.webapp.springbootweb.models.dto.ParamDto;

@RestController
@RequestMapping("/api/path")
public class PathVariableController {

    @Value("${config.nombre}")
    private String nombre;
    @Value("${config.apellido}")
    private String apellido;
    @Value("${config.edad}")
    private int edad;


    @GetMapping("/variable/{mensaje}")
    public ParamDto envioVariable(@PathVariable String mensaje) {

        ParamDto paramDto = new ParamDto();
        paramDto.setMensaje(mensaje);
        return paramDto;
    }


    @GetMapping("/variables/{nombreProducto}/{idProducto}")
    public Map<String, Object> variables(@PathVariable String nombreProducto, @PathVariable Integer idProducto) {

        Map<String, Object> jsonMap = new HashMap<>();
        jsonMap.put("nombreProducto", nombreProducto);
        jsonMap.put("idProducto", idProducto);

        return jsonMap;

    }


    @PostMapping("/crear")
    public User crearUsuario (@RequestBody User user){
        user.setNombre(user.getNombre().toUpperCase());
        return user;
    }


    @GetMapping("/inyeValores")
    public Map<String, Object> valores(@Value("${config.arreglo}") Integer[] arreglo){

        Map<String, Object> json = new HashMap<>();
        json.put("nombre", nombre);
        json.put("apellido", apellido);
        json.put("edad", edad);
        json.put("arreglo", arreglo);
        return json;
    }

}

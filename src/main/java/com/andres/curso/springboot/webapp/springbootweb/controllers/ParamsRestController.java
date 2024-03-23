package com.andres.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.andres.curso.springboot.webapp.springbootweb.models.dto.ParamDto;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/params")
public class ParamsRestController {


    @GetMapping("consultaVariable")
    public ParamDto consultarVariable(@RequestParam(required = false, defaultValue = "Hola andres, ¿Como estas?") String mensaje){
        ParamDto paramDto = new ParamDto();
        paramDto.setMensaje(mensaje);
        return paramDto;        
    }
    

    @GetMapping("consultaVariable2")
    public ParamDto consultarVariable2(@RequestParam String mensaje, @RequestParam(required = false) Integer codigo){
        ParamDto paramDto = new ParamDto();
        paramDto.setMensaje(mensaje);
        paramDto.setCodigo(codigo);
        return paramDto;        
    }
}

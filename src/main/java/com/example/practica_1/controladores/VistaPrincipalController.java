package com.example.practica_1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class VistaPrincipalController {

    @GetMapping("/")
    public String redirigirAListaDeEstudiantes() {
        return "redirect:/estudiantes";
    }
    
}

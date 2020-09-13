package com.example.practica_1.controladores;

import com.example.practica_1.entidades.Estudiante;
import com.example.practica_1.servicios.EstudianteServices;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
    
    @Autowired
    private EstudianteServices estudianteServices;

    @GetMapping("/")
    public String listarEstudiantes(Model model) {
        return "listarEstudiantes";
    }

    @GetMapping("/crear")
    public String crearEstudiante(Model model) {
        model.addAttribute("estudiante", new Estudiante());
        model.addAttribute("accion", "Crear");
        model.addAttribute("direccionPost", "/estudiantes/crear");
        return "crearEstudiante";
    }

    @PostMapping(path = "/crear", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String crearEstudiante() {
        System.out.println("\n\n\n"+);
        //TODO: process POST Estudiante estudiante;
    }
    
    

}

package com.example.practica_1.servicios;

import java.util.List;

import javax.transaction.Transactional;

import com.example.practica_1.entidades.Estudiante;
import com.example.practica_1.repositorio.EstudianteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServices {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Transactional
    public Estudiante crearEstudiante(Estudiante estudiante) {
        estudianteRepository.save(estudiante);
        return estudiante;
    }

    public List<Estudiante> obtEstudiantes() {
        return estudianteRepository.findAll();
    }
    
}

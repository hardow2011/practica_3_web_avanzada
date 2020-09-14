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

    /**
     * Crear estudiante.
     * @param estudiante
     * @return
     */
    @Transactional
    public Estudiante crearEstudiante(Estudiante estudiante) {
        estudianteRepository.save(estudiante);
        return estudiante;
    }

    /**
     * Retornar un estudiante dado su id
     * @param idEstudiante
     * @return
     */
    public Estudiante obtEstudiante(long idEstudiante) {
        // Se usa get() porque es estudianteRepository.findById(idEstudiante)...
        // retorna Optional<Estudiante> y hay que conseguir el estudiante con get().
        return estudianteRepository.findById(idEstudiante).get();

    }

    /**
     * Retorna la lista de estudiantes.
     * @return
     */
    public List<Estudiante> obtEstudiantes() {
        return estudianteRepository.findAll();
    }
    
    public void eliminarEstudiante(Estudiante estudiante) {
        estudianteRepository.delete(estudiante);
    }

}

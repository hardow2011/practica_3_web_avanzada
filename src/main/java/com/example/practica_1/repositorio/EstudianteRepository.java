package com.example.practica_1.repositorio;

import com.example.practica_1.entidades.Estudiante;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long>{
    
}

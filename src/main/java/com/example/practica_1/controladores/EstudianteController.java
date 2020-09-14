package com.example.practica_1.controladores;

import com.example.practica_1.entidades.Estudiante;
import com.example.practica_1.servicios.EstudianteServices;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;


@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
    
    @Autowired
    private EstudianteServices estudianteServices;

    /**
     * Listar los estudiantes.
     * El value del mapping puede ser "/estudiantes/" o "/estudiantes".
     * @param model
     * @return
     */
    @GetMapping({"/", ""})
    public String listarEstudiantes(Model model) {
        model.addAttribute("accion", "Listar");
        model.addAttribute("listaEstudiantes", estudianteServices.obtEstudiantes());
        return "listarEstudiantes";
    }

    /**
     * GET de crear estudiante.
     * @param moidEstudiantedel
     * @return
     */
    @GetMapping("/crear")
    public String crearEstudiante(Model model) {
        model.addAttribute("estudiante", new Estudiante());
        model.addAttribute("accion", "Crear");
        model.addAttribute("direccionPost", "/estudiantes/crear");
        return "crearEstudiante";
    }

    
    /**
     * POST de crear estudiante.
     * El atributo name de los campos input debe ser igual que...
     * su campo correspondiente en el objeto.
     * @param estudiante recibe un estudiante del form
     * @return
     */
    @PostMapping("/crear")
	public String crearEstudiante(Estudiante estudiante) {
        // Crear el estudiante en la BD.
        estudianteServices.crearEstudiante(estudiante);
        // Redirigir al controlador de crear.
		return "redirect:/estudiantes/crear";
    }
    
    /**
     * Eliminar un estudiante teniendo su id
     * @param idEstudiante
     * @return
     */
    @GetMapping("/eliminar/{idEstudiante}")
    public String eliminarEstudiante(@PathVariable() Long idEstudiante) {
        Estudiante estudiante = estudianteServices.obtEstudiante(idEstudiante);
        estudianteServices.eliminarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/editar/{idEstudiante}")
    public String editarEstudiante(Model model, @PathVariable() Long idEstudiante) {
        Estudiante estudiante = estudianteServices.obtEstudiante(idEstudiante);
        model.addAttribute("accion", "Editar");
        model.addAttribute("estudiante", estudiante);
        model.addAttribute("direccionPost", "/estudiantes/editar");
        return "crearEstudiante";
    }


    @PostMapping("/editar")
    public String editarEstudiante(Estudiante estudiante){
            // Estudiante estudiante = estudianteServices.obtEstudiante(idEstudiante);
            // estudiante.setMatricula(estudianteEditado.getMatricula());
            // estudiante.setNombre(estudianteEditado.getNombre());
            // estudiante.setTelefono(estudianteEditado.getTelefono());
            estudianteServices.actualizarEstudiante(estudiante);
            return "redirect:/estudiantes";
    }

}

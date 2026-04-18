package com.programacion3.ColegioAdmin.controller;


import com.programacion3.ColegioAdmin.entity.Estudiante;
import com.programacion3.ColegioAdmin.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

/**
 * Controlador REST para gestionar estudiantes.
 *
 * Expone endpoints para listar y registrar estudiantes.
 */
@Controller // Controlador MVC
@RequestMapping("/estudiantes") // Ruta base para estudiantes
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    // Listar todos los estudiantes
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("estudiantes", estudianteService.findAll());
        return "estudiantes"; // Renderiza estudiantes.ftl
    }

    // Mostrar formulario para nuevo estudiante
    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("estudiante", new Estudiante());
        return "form-estudiantes";
    }

    // Guardar estudiante (nuevo o editado)
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Estudiante estudiante) {
        estudianteService.save(estudiante);
        return "redirect:/estudiantes"; // Redirige a la lista
    }

    // Editar estudiante existente
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        model.addAttribute("estudiante", estudianteService.findById(id));
        return "form-estudiantes";
    }

    // Eliminar estudiante
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        estudianteService.deleteById(id);
        return "redirect:/estudiantes";
    }
}
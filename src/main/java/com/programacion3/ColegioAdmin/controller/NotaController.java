package com.programacion3.ColegioAdmin.controller;

import com.programacion3.ColegioAdmin.entity.Nota;
import com.programacion3.ColegioAdmin.service.EstudianteService;
import com.programacion3.ColegioAdmin.service.NotaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;


/**
 * Controlador REST para gestionar las notas académicas.
 *
 * Expone endpoints para listar y registrar notas.
 */
@Controller
@RequestMapping("/notas")
public class NotaController {
    @Autowired
    private NotaService notaService;
    @Autowired
    private EstudianteService estudianteService;

    // Listar todas las notas
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("notas", notaService.findAll());
        return "notas"; // Renderiza notas.ftl
    }

    // Mostrar formulario para nueva nota
    @GetMapping("/nueva")
    public String nueva(Model model) {
        model.addAttribute("nota", new Nota());
        model.addAttribute("estudiantes", estudianteService.findAll()); // Para el select
        return "form-notas";
    }

    // Guardar nota (nuevo o editado)
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Nota nota) {
        notaService.save(nota);
        return "redirect:/notas";
    }

    // Editar nota existente
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        model.addAttribute("nota", notaService.findById(id));
        model.addAttribute("estudiantes", estudianteService.findAll());
        return "form-notas";
    }

    // Eliminar nota
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        notaService.deleteById(id);
        return "redirect:/notas";
    }
}


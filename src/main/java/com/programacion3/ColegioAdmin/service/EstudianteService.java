package com.programacion3.ColegioAdmin.service;

import com.programacion3.ColegioAdmin.entity.Estudiante;
import com.programacion3.ColegioAdmin.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio para gestionar la lógica de negocio relacionada con estudiantes.
 */
@Service // Marca la clase como un servicio de Spring
public class EstudianteService {
    @Autowired // Inyección automática del repositorio
    private EstudianteRepository estudianteRepository;

    // Obtener todos los estudiantes
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    // Buscar estudiante por ID
    public Estudiante findById(Integer id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    // Guardar o actualizar estudiante
    public void save(Estudiante estudiante) {
        estudianteRepository.save(estudiante);
    }

    // Eliminar estudiante por ID
    public void deleteById(Integer id) {
        estudianteRepository.deleteById(id);
    }
}

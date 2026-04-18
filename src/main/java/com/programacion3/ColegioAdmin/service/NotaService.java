package com.programacion3.ColegioAdmin.service;

import com.programacion3.ColegioAdmin.entity.Nota;
import com.programacion3.ColegioAdmin.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio para gestionar la lógica de negocio relacionada con notas.
 */
@Service
public class NotaService {
    @Autowired
    private NotaRepository notaRepository;

    // Obtener todas las notas
    public List<Nota> findAll() {
        return notaRepository.findAll();
    }

    // Buscar nota por ID
    public Nota findById(Integer id) {
        return notaRepository.findById(id).orElse(null);
    }

    // Guardar o actualizar nota
    public void save(Nota nota) {
        notaRepository.save(nota);
    }

    // Eliminar nota por ID
    public void deleteById(Integer id) {
        notaRepository.deleteById(id);
    }
}

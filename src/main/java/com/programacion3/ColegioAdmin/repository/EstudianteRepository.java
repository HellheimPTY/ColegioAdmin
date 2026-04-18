package com.programacion3.ColegioAdmin.repository;

import com.programacion3.ColegioAdmin.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio para la entidad Estudiante.
 *
 * Extiende JpaRepository para proveer operaciones CRUD sin necesidad de código adicional.
 */
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {}

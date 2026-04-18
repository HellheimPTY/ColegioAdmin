package com.programacion3.ColegioAdmin.repository;

import com.programacion3.ColegioAdmin.entity.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio para la entidad Nota.
 *
 * Extiende JpaRepository para proveer operaciones CRUD sin necesidad de código adicional.
 */
public interface NotaRepository extends JpaRepository<Nota, Integer> {}

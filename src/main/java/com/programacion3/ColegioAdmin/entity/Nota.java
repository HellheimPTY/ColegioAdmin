package com.programacion3.ColegioAdmin.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entidad que representa una nota académica.
 *
 * Cada nota está asociada a un estudiante.
 */
@Entity
@Table(name = "notas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Nota {
    /** Identificador único de la nota */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNota;

    /** Asignatura a la que corresponde la nota */
    private String asignatura;

    /** Grado escolar de la asignatura */
    private String grado;

    /** Nota definitiva obtenida */
    private double notaDefinitiva;

    /** Estudiante al que pertenece la nota */
    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private Estudiante estudiante;
}

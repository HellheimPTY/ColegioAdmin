package com.programacion3.ColegioAdmin.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

/**
 * Entidad que representa a un estudiante en el sistema.
 *
 * Cada estudiante puede tener múltiples notas asociadas.
 */
@Entity
@Table(name = "estudiantes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {
    /** Identificador único del estudiante */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /** Nombres del estudiante */
    private String nombres;

    /** Apellidos del estudiante */
    private String apellidos;

    /** Grado escolar en el que se encuentra */
    private String grado;

    /** Edad del estudiante */
    private int edad;

    /** Género del estudiante */
    private String genero;

    /** Teléfono de contacto */
    private String telefono;

    /** Lista de notas asociadas al estudiante */
    @OneToMany(mappedBy = "estudiante", cascade = CascadeType.ALL)
    private List<Nota> notas;
}

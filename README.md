#  ColegioAdmin

Sistema académico para la gestión de **Estudiantes** y **Notas**, desarrollado con **Spring Boot**, **JPA/Hibernate**, **MySQL** y **FreeMarker** como motor de plantillas.  
Incluye un layout base con **TailwindCSS** para una interfaz moderna y responsiva.

---

##  Características principales
- CRUD completo para **Estudiantes**:
    - Campos: `id` (auto‑incrementado), `nombres`, `apellidos`, `grado`, `edad`, `genero`, `telefono`.
    - Formularios con validaciones seguras (género como `select`).
- CRUD completo para **Notas**:
    - Campos: `idNota` (auto‑incrementado), `asignatura`, `grado`, `notaDefinitiva`, `estudiante`.
    - Asignaturas gestionadas mediante `select` para consistencia.
- Relación **Uno a Muchos** entre `Estudiante` y `Nota`.
- Layout base (`home.ftl`) con menú lateral y contenido dinámico.
- Formularios reutilizables para creación y edición.
- Tablas de listado con acciones de editar y eliminar.

---

##  Tecnologías utilizadas
- **Java 21**
- **Spring Boot 4.1.0**
- **Spring Data JPA / Hibernate**
- **MySQL**
- **FreeMarker**
- **TailwindCSS**

---

##  Estructura del proyecto
```
src/main/java/com/programacion3/ColegioAdmin
├── controller
│    ├── EstudianteController.java
│    └── NotaController.java
├── entity
│    ├── Estudiante.java
│    └── Nota.java
├── service
│    ├── EstudianteService.java
│    └── NotaService.java
└── repository
├── EstudianteRepository.java
└── NotaRepository.java

src/main/resources/templates
├── home.ftl
├── inicio.ftl
├── estudiantes.ftl
├── form-estudiantes.ftl
├── notas.ftl
└── form-notas.ftl
```

## Configuración
1. Crear base de datos en MySQL:
   ```sql
   CREATE DATABASE colegio;
   USE colegio;

## Configurar application.properties:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/colegio
spring.datasource.username=tu_usuario
spring.datasource.password=tu_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.profiles.active=dev

spring.freemarker.template-loader-path=classpath:/templates/
spring.freemarker.suffix=.ftl
spring.freemarker.cache=false
``` 

## Endpoints principales

- `/home` → Página de inicio.
- `/estudiantes` → Listado de estudiantes.
- `/estudiantes/nuevo` → Formulario de nuevo estudiante.
- `/notas` → Listado de notas.
- `/notas/nueva` → Formulario de nueva nota.

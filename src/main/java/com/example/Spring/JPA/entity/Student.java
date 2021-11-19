package com.example.Spring.JPA.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Estudiantes")

public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    Integer dni;
    String nombre;
    String apellido;
    String correo;
    String direccion;
    Collection<Expediente> expedientes;

}

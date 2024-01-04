package com.example.diagnostico.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "persona")
public class PersonBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    private Integer id_person;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellidopaterno", nullable = false)
    private String apellidopaterno;

    @Column(name = "apellidomaterno", nullable = false)
    private String apellidomaterno;

    @Column(name = "fechanac", nullable = false)
    private String fechanac;

    @Column(name = "curp", nullable = false)
    private String curp;
}

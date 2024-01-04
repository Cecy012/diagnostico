package com.example.diagnostico.model.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class PersonDto {
    private Integer id_person;
    private String nombre;
    private String apellidopaterno;
    private String apellidomaterno;
    private String fechanac;
    private String curp;

}

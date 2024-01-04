package com.example.diagnostico.controller;

import com.example.diagnostico.model.dto.PersonDto;
import com.example.diagnostico.model.entity.PersonBean;
import com.example.diagnostico.service.IPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/v1/person")
public class PersonController {
    @Autowired
    private IPerson personService;
    @GetMapping("/")
    public List<PersonBean> getPerson() {
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public PersonBean showById(@PathVariable Integer id) {
        return personService.findById(id);
    }

    @PostMapping("/")
    public PersonDto create(@RequestBody PersonDto personDto ) {
        PersonBean personSave = personService.save(personDto);
        return PersonDto.builder()
                .id_person(personSave.getId_person())
                .nombre(personSave.getNombre())
                .apellidopaterno(personSave.getApellidopaterno())
                .apellidomaterno(personSave.getApellidopaterno())
                .fechanac(personSave.getFechanac())
                .curp(personSave.getCurp())
                .build();
    }
    @PutMapping("/")
    public PersonDto updtae(@RequestBody PersonDto personDto){
        PersonBean personUpdate = personService.save(personDto);
        return PersonDto.builder()
                .id_person(personUpdate.getId_person())
                .nombre(personUpdate.getNombre())
                .apellidopaterno(personUpdate.getApellidopaterno())
                .apellidomaterno(personUpdate.getApellidopaterno())
                .fechanac(personUpdate.getFechanac())
                .curp(personUpdate.getCurp())
                .build();
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        PersonBean person = personService.findById(id);
        personService.delete(person);
    }
}

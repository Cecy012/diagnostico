package com.example.diagnostico.service;

import com.example.diagnostico.model.dto.PersonDto;
import com.example.diagnostico.model.entity.PersonBean;

import java.util.List;
public interface IPerson {
    PersonBean save(PersonDto person);
    PersonBean findById(Integer id);
    List<PersonBean> findAll();
    void delete (PersonBean person);
}

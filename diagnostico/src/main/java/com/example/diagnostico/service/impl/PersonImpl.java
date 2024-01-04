package com.example.diagnostico.service.impl;

import com.example.diagnostico.model.dao.PersonDao;
import com.example.diagnostico.model.dto.PersonDto;
import com.example.diagnostico.model.entity.PersonBean;
import com.example.diagnostico.service.IPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonImpl implements IPerson {
    @Autowired
    private PersonDao personDao;
    @Override
    @Transactional
    public PersonBean save(PersonDto personDto){
        PersonBean person = PersonBean.builder()
                .id_person(personDto.getId_person())
                .nombre(personDto.getNombre())
                .apellidopaterno(personDto.getApellidopaterno())
                .apellidomaterno(personDto.getApellidomaterno())
                .fechanac(personDto.getFechanac())
                .curp(personDto.getCurp())
                .build();
        return personDao.save(person);
    }
    @Override
    @Transactional(readOnly = true)
    public PersonBean findById(Integer id){
        return personDao.findById(id).orElse(null);
    }
    @Override
    @Transactional(readOnly = true)
    public List<PersonBean> findAll(){
        return(List<PersonBean>) personDao.findAll();
    }
    @Override
    @Transactional
    public void delete(PersonBean person){
        personDao.delete(person);
    }
}

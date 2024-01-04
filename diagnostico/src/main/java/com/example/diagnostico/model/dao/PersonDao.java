package com.example.diagnostico.model.dao;

import com.example.diagnostico.model.entity.PersonBean;
import org.springframework.data.repository.CrudRepository;

public interface PersonDao extends CrudRepository<PersonBean, Integer> {
}

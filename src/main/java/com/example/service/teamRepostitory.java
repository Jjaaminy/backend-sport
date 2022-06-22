package com.example.service;

import com.example.model.Myteam;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.repository.CrudRepository;

import java.util.Locale;

public interface teamRepostitory extends CrudRepository <Myteam, Long> {

/*
    <S extends T> S save(S entity);

    T findOne(ID primaryKey);

    Iterable<T> findAll();

    Long count();

    void delete(T entity);

    boolean exists(ID primaryKey);

    ... more functionality omitted.
*/

}


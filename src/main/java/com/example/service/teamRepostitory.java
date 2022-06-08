package com.example.service;

import com.example.model.Myteam;
import org.springframework.data.repository.CrudRepository;

public interface teamRepostitory extends CrudRepository<Myteam, Long> {
    /*List<team> findByLastName(String lastName);
    team findById(int id); */
}


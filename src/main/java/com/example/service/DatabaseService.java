package com.example.service;

import com.example.model.Myteam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class DatabaseService {
    public List<Myteam> getTeam() {
        StreamSupport.stream(
                        teamRepostitory
                                .findAll()
                                .spliterator(), false)
                .collect(Collectors.toList());
    }
}


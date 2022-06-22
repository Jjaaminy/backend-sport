package com.example.controller;

import com.example.model.Myteam;
import com.example.service.teamRepostitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Teamrestcontroller {

    private teamRepostitory repo;
    private List<Myteam> list;

    @Autowired
    public Teamrestcontroller(teamRepostitory repo) {
        this.repo = repo;
    }

    @GetMapping("players")
    public List<Myteam> getPlayers() {
        return (List<Myteam>) repo.findAll();
    }

    @GetMapping("/players/{id}")
    public Myteam getById(@PathVariable int id) {
        return list.stream()
                .filter(todo -> todo.getId() == id)
                .findFirst()
                .get();
    }

}









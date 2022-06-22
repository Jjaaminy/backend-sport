package com.example.controller;

import com.example.model.Myteam;
import com.example.service.teamRepostitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
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
/*
    // TODO: CRUD Funktionen implementieren
    @GetMapping("")
    public List<Myteam> getTeam() {
        return list;
    }

    @GetMapping("/{id}")
    public Myteam getTodoById(@PathVariable int id) {
        return list.stream()
                .filter(todo -> todo.getId() == id)
                .findFirst()
                .get();
    }
*/
    //delete = löscht adressierte element aus der collection
    @DeleteMapping("/players/{id}")
    private void deleteTodo(@PathVariable int deleteid) {
        Myteam del = list.stream()
                .filter(todo -> todo.getId() == deleteid)
                .findFirst()
                .get();
        list.remove(del);
    }

    //Delete = alles löschen
    @DeleteMapping("/players")
    private void deleteall(){
        list.clear();
    }


    //Put = ersetzt die collection mit der neuen Collection
    @PutMapping("/players/{id}")
    public void updateTeam(@RequestBody Myteam team, @PathVariable int id) {
        Myteam update = list.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .get();
        update.setAlter(team.getAlter());
        update.setClub(team.getClub());
        update.setGroesse(team.getGroesse());
        update.setNationalitaet(team.getNationalitaet());
        update.setName(team.getName());
        update.setVorname(team.getVorname());
    }

}









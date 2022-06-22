package com.example.service;

import com.example.model.Myteam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequestMapping("/players")
public class DatabaseService {

    private teamRepostitory repo;
    private List<Myteam> list;

    @Autowired
    public DatabaseService(teamRepostitory repo) {
        this.repo = repo;
    }

    public List<Myteam> getJokes() {
       // return new ArrayList<>();
        // mit Stream-Utitilies
		return StreamSupport.stream(
                repo
                        .findAll()
                        .spliterator(), false)
                            .collect(Collectors.toList());
    }

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

    //delete = löscht adressierte element aus der collection
    @DeleteMapping("/{id}")
    private void deleteTodo(@PathVariable int deleteid) {
        Myteam del = list.stream()
                .filter(todo -> todo.getId() == deleteid)
                .findFirst()
                .get();
        list.remove(del);
    }

    //Delete = alles löschen
    @DeleteMapping("")
    private void deleteall(){
        list.clear();
    }


    //Put = ersetzt die collection mit der neuen Collection
    @PutMapping("/{id}")
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

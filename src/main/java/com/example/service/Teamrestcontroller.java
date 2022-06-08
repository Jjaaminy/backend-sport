package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Teamrestcontroller {

    private teamRepostitory repo;

    @Autowired
    public Teamrestcontroller(teamRepostitory repo) {
        this.repo = repo;
    }


    //GET = Basis URL (collection mit den elementen zurück
  /*  @GetMapping("/player")
    public List<myteam> getPlayers() {
        return list;
    }

    @GetMapping("/player/{id}")
    public myteam getTeambyID(@PathVariable int id) {
        return list.stream()
                .filter(team -> team.getId() == id)
                .findFirst()
                .get();
    }


*/
}

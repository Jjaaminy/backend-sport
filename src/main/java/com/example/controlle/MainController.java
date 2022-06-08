package com.example.controlle;

import com.example.service.teamRepostitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MainController {

    private teamRepostitory repo;

    @Autowired
    public MainController(teamRepostitory repo) {
        this.repo = repo;
    }


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("list", repo.findAll());
        return "index";
    }

    @PostMapping("/")
    public void deleteteam(@RequestParam(required = true) String id) {
        System.out.println("delete Joke: " + id);
    }

}

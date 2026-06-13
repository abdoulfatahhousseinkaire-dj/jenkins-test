package com.mugen.jenkins.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/")
    public String hello() {
        return "Bienvenue dans ton app avec le cicd jenkins :) pipeline fonctionnel";
    }
}

package com.mugen.jenkins.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    private static final Logger log = LoggerFactory.getLogger(Home.class);


    @GetMapping("/")
    public String hello() {
        log.info("Utilisateur connecté : mugen");
        log.info("Type de connexion : ssh");
        log.info("Appareil : Lenovo");
        log.info("OS : windows");
        return "Bienvenue dans ton app avec le cicd jenkins :) pipeline ok";
    }
}

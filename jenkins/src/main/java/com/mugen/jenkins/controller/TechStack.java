package com.mugen.jenkins.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechStack {

    private static final Logger log = LoggerFactory.getLogger(TechStack.class);

    @GetMapping("/stack")
    public String hello() {
        log.info("Backend  : Springboot");
        log.info("Frontend : React JS");
        log.info("Devops   : Jenkins - Ansible - Promtail - Loki - Grafana");
        log.info("System   : Linux / Ubuntu 24.00");
        return "[React - Springboot - Devops Tools - Linux]";
    }

}

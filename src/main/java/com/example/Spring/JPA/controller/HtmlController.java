package com.example.Spring.JPA.controller;

import com.example.Spring.JPA.services.studentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    @Autowired
    private studentServices service;

    @GetMapping("/homepage")
    public String homepage(Model model){

        model.addAttribute("yoSoy", "leslie");
        return "home";
    }

    //Muestra los estudiantes
    @GetMapping("/listStudent")
    public String listStudent(Model model){

        model.addAttribute("students", service.getLista());
        return "alumnos";
    }

}


package com.kula.springnobootbase.components.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("names")
public class MyController {

    @GetMapping
    public List<String> getNames(){
        return List.of("Yunus","Mami");

    }
}

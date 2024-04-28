package com.Farmed.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class hellocontroller {
    private List<hello> db= List.of(new hello(1,"peter"),new hello(2,"Edwin"));




    @GetMapping("/okay")
    public List<hello> hae(){

        return db;
    }

    @GetMapping("/see")
    public List<hello> sees(){
        return db;

    }
}

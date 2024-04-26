package com.Farmed.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting greeting() {
        return new Greeting(1, "Hello World!");
    }

    @GetMapping("/greetings")
    public List<Greeting> greetings() {
        List<Greeting> greetings = new ArrayList<>();
        greetings.add(new Greeting(1, "Hello world"));
        greetings.add(new Greeting(2, "Hello Mars"));
        return greetings;
    }
}
//    List<Greeting> greeting(){
//// implementation
//    }
//
//
//[
//        {1, "Hello World"},
//        {2, "Hello Mars"}
//        ]

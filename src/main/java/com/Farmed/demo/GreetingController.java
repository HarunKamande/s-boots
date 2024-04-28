package com.Farmed.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting greeting() {
        return new Greeting(1, "Hello World!");
    }

    @GetMapping("/greetings")
    public List<Greeting> greetings() {
         List<Greeting> greet=List.of(new Greeting(1,"hello world"),new Greeting(2,"Hello mars"));

        return greet;
    }
}
//    List<Greeting> greeting(){
//// implementation
//    }
//
//[
//        {1, "Hello World"},
//        {2, "Hello Mars"}
//        ]

package com.Farmed.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Usercontrol {

    private Map<String, Users> usersM = new HashMap<>();

public Usercontrol(){
        usersM.put("Kamande", new Users(1, "Kamande", "Harun"));
        usersM.put("Harun", new Users(2, "Harun", "Kamande"));
        usersM.put("Peter",new Users(3,"Peter","Irungu"));
}

    @GetMapping("/userss")
    public Map hello(){
        return usersM;
    }
}

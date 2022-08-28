package com.deblinaprojects.org.restfulwebservices;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/helloWorld", produces = MediaType.APPLICATION_JSON_VALUE)
    public String helloWorld(){
        return "Hello World";
    }
}

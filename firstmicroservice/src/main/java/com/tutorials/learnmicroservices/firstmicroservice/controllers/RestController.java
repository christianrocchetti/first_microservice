package com.tutorials.learnmicroservices.firstmicroservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {



    // Mapping delle richiesta sull URL .../hello
    @RequestMapping(value = "/hello")
    // La stringa che venga restuita da questo metodo sara'
    // dirattamnete nel corpo della risposta HTTP
    @ResponseBody
    public String sayHello() {
        return "Hello everyone!";
    }


}

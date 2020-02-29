package com.tutorials.learnmicroservices.firstmicroservice.controllers;

import com.tutorials.learnmicroservices.firstmicroservice.entities.User;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;



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

    //if pwd is null it will still return a user
    @RequestMapping("/newuser1")
    public String addUser(User user){
        return "User added correctly:" + user.getId() + ", "+ user.getUsername();
    }

    //if pwd is null it will return a JAVA JSR-303 error message thanks to @Valid
    @RequestMapping("/newuser2")
    public String addUserValid(@Valid User user){
        return "User added correctly:" + user.getId() + ", "+ user.getUsername();
    }

    //if pwd is null it will return a JAVA JSR-303 error message thanks to Spring object BindingResult
    @RequestMapping("/newuser3")
    public String addUserValidPlusBinding(@Valid User user, BindingResult result){
        if(result.hasErrors()){
            return result.toString();
        }
        return "User added correctly:" + user.getId() + ", "+ user.getUsername();
    }


    

}

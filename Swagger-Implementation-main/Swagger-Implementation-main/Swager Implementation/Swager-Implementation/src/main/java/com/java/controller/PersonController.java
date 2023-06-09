package com.java.controller;

import com.java.model.Main;

import com.java.model.Person;

import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/api/person")
@Api(tags = "Person API")


public class PersonController {

    private final Person person;

    public PersonController() {
        person = new Person();

        person.setName("Raj");
        person.setId(1);
        person.setAddress("Texas");

    }

    @GetMapping("/name")
    @ApiOperation("Get person's name")
    public String getPersonName() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(person.getId()).append("\n");
        sb.append("Name: ").append(person.getName()).append("\n");
        sb.append("Address: ").append(person.getAddress()).append("\n");
        return sb.toString();
    }

//    @GetMapping("/name")
//    @ApiOperation("Get person's name")
//    public String getPersonName() {
//        return person.getAddress();
//    }
}
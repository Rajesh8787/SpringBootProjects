package com.beastgroup.beast.airways.controller;

import com.beastgroup.beast.airways.responce.AirwaysResponce;
import com.beastgroup.beast.airways.service.BeastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;


//current spring version:6.1
//controller was introduce in spring 2.5 and RestController was introduced in spring 4.0

//@RestController = @Controller + @ResponseBody (References:  https://medium.com/javarevisited/difference-between-controller-and-restcontroller-in-spring-boot-and-spring-mvc-216578ad445f)
//@RestController:  return response like JSON or XML.
//@Controller:  only return as response to client
//https://medium.com/javarevisited/difference-between-controller-and-restcontroller-in-spring-boot-and-spring-mvc-216578ad445f)

//RestController introduced in spring 4.0 while COntroller in spring 2.5.


@RestController

//@RequestMapping : is used for map to all existing api which is inside the controller class'.
@RequestMapping("/")

public class BeastAirwaysController {


    // creating a simple Restful API

    @GetMapping("home")
    // access modifier+ static/default + data type+ method name  asddm
    public String getHome(){
        return "Hello welcome to the Beast Airways";

//   /* @Autowired
//    private BeastService beastService;*/
//    @GetMapping(value = "/" ,produces ="application/json")
//    public AirwaysResponce getHome(){
//        //Type sout and press Tab for System.out.println();
//        AirwaysResponce airwaysResponce = new AirwaysResponce("Welcome to Beast Airways");
//        return airwaysResponce;



    }




}


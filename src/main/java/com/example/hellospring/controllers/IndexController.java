package com.example.hellospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;

@RestController
public class IndexController {
    @GetMapping("/helloSpring")
    public String helloSpring(){
        return "Hej med dig, velkommen til noget pænt sejt!";
    }
    @GetMapping("/echo")
    public String echo(String echo){
        return echo;
    }

    @GetMapping("/erdetfredag")
    public String erDetFredag(){
        DayOfWeek date = LocalDate.now().getDayOfWeek();
        String erDetFredag = "";

        if(date.toString().equals("FRIDAY")){
            erDetFredag = "JA! Det er FREDAG!!!";
        }else{
            erDetFredag = "Nej, desværre... det er ikke fredag";

        }
        return erDetFredag;
    }
}

package com.fortune.Fortunes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/getFortune")
public class FortuneController{
    @GetMapping
    Fortune getFortune(){
        return FortuneTeller.getFortune();
    }
}
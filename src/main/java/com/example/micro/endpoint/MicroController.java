package com.example.micro.endpoint;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping()
public class MicroController {

    @GetMapping("/artur")
    public String artur() {

        System.out.println("Witam Artur");

        return "Witamy Arturze czy kupiłeś już maskę ?"; }


    @GetMapping("/marta")
    public String marta() {

        System.out.println("Witam Marto");

        return "Witamy Marto"; }


    @GetMapping("/marcin")
    public String marcin() {

        System.out.println("Witam Marcin");

        return "Witamy Marcinie"; }

}

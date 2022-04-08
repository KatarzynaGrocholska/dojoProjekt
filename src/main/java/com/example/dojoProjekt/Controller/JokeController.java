package com.example.dojoProjekt.Controller;


import com.example.dojoProjekt.Service.JokeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("http://localhost:4200")
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/joke")
public class JokeController {

    private final JokeService jokeService;

    @GetMapping(path="/random")
    public String random(){
        return jokeService.jokeRandom();
    }



    }




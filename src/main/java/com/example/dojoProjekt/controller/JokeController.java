package com.example.dojoProjekt.controller;

import com.example.dojoProjekt.service.JokeService;
import com.example.dojoProjekt.model.Joke;
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
    public Joke random(){
        return jokeService.jokeRandom();
    }
    }




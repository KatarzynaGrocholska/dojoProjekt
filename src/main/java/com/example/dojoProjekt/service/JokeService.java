package com.example.dojoProjekt.service;

import com.example.dojoProjekt.model.Joke;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JokeService {

    private final RestTemplate restTemplate = new RestTemplate();

    public Joke jokeRandom() {
        return restTemplate.getForObject(
                "https://api.chucknorris.io/jokes/random", Joke.class);
    }
}
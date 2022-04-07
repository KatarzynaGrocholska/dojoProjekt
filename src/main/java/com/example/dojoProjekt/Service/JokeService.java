package com.example.dojoProjekt.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JokeService {

    private final RestTemplate restTemplate = new RestTemplate();


    public String jokeRandom() {
        return restTemplate.getForObject(
                "https://api.chucknorris.io/jokes/random", String.class);

    }
}
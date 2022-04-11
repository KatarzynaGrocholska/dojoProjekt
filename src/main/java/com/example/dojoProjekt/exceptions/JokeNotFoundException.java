package com.example.dojoProjekt.exceptions;

public class JokeNotFoundException extends RuntimeException {

    public JokeNotFoundException(String message) {
        super(message);
    }
}

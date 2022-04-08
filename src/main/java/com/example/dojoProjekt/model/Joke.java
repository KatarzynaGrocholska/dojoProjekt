package com.example.dojoProjekt.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class Joke {

    private String value;

    @Override
    public String toString() {
        return "Value{" +

                ", joke='" + value + '\'' +
                '}';
    }


}

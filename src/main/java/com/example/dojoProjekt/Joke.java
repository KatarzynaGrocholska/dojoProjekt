package com.example.dojoProjekt;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class Joke {
    private String id;
    private String value;

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", joke='" + value + '\'' +
                '}';
    }


}

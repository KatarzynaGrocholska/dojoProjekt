package com.example.dojoProjekt.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class Joke {

    private String created_at;
    private String icon_url;
    private String id;
    private String updated_at;
    private String url;
    private String value;

    @Override
    public String toString() {
        return value;
    }


}

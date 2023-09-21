package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserJson {

    @JsonProperty("id")
    int id;

    @JsonProperty("name")
    String name;

    @JsonProperty("money")
    double money;

    @JsonProperty("date")
    String date;

}





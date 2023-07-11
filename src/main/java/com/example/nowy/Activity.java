package com.example.nowy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

@JsonSerialize
@Data
public class Activity {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("nazwa")
    private String name;
    @JsonProperty("ects")
    private Integer ects;
    @JsonProperty("sala")
    private Integer room;
    @JsonProperty("egzamin")
    private String exam;

}

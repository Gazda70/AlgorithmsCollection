package com.gazda.algorithms.graph.model.graph;

public class Identifier {
    private String description;
    private Integer number;

    Identifier(String description){
        this.description = description;
    }
    Identifier(Integer number){
        this.number = number;
    }
    Identifier(String description, Integer number){
        this.description = description;
        this.number = number;
    }
}

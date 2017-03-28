package com.geekhub.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "properties.tyres")
public class Tyres {
    private Long id;
    private Integer size;
    private String name;

    public Tyres(Integer size, String name){
        this.size = size;
        this.name = name;
    }

    public Tyres(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tyres size = " + size + ", Tyres name = " + name;
    }
}

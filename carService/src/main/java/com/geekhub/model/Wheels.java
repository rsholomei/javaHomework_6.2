package com.geekhub.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "properties.wheels")
public class Wheels {
    private Long id;
    private Long tyres_Id;

    public Wheels(){}

    public Wheels(Long tyres_Id){
        this.tyres_Id = tyres_Id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTyresId() {
        return tyres_Id;
    }

    public void setTyresId(Long tyres_Id) {
        this.tyres_Id = tyres_Id;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "id=" + id +
                ", tyres_Id=" + tyres_Id +
                '}';
    }
}

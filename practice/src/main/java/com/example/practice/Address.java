package com.example.practice;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Document


@Entity
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String streetName;
    private String city;
    private String state;
    private String country;



    public void setStreetName(String streetName)
    {
        this.streetName=streetName;

    }

    public void setCity(String city)
    {

        this.city=city;

    }

    public void setState(String state)
    {
        this.state=state;
    }
    public void setCountry(String country)
    {
        this.country=country;
    }

    public String getStreetName()
    {
        return streetName;
    }

    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry()
    {
        return country;
    }
}

package com.example.springdatajpa01;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Auto {

    // ATRIBUTOS ENCAPSULADOS //////////////////////
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String manufacturer;
    private String model;
    private Integer year;

    // CONSTRUCTORES /////////////////////////


    public Auto() {
    }

    public Auto(Long id, String manufacturer, String model, Integer year) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    //GETTERS Y SETTERS ///////////////////


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    // ToString  ////////////////////////////////


    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", model='" + manufacturer + '\'' +
                ", manufacturer='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

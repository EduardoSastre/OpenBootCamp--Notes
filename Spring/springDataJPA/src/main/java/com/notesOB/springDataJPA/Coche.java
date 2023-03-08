package com.notesOB.springDataJPA;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //This annotation indicates that this is a Sql Table
public class Coche {

    @Id //This annotation indicates that this attributes is the primary key of the table SQL
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This autogenerates the primary key ( Example ids: 1, then 2, then 3, .... )
    private Long id;
    private String manufacturer;
    private String model;
    private Integer releseYear;

    public Coche() {
    }

    public Coche(Long id, String manufacturer, String model, Integer releseYear) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.releseYear = releseYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getReleseYear() {
        return releseYear;
    }

    public void setReleseYear(Integer releseYear) {
        this.releseYear = releseYear;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", releseYear=" + releseYear +
                '}';
    }
}

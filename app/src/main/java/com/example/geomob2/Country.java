package com.example.geomob2;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "Country")
public class Country implements Serializable {

    public Country(String title, int image, String population, String description, String Surface, int hymne) {
        this.title = title;
        this.image = image;
        this.population = population;
        this.description=description;
        this.Surface=Surface;
        this.hymne=hymne;

    }
    @PrimaryKey
    @NonNull
    private String title;
    @ColumnInfo(name = "image")
    private int image;
    @ColumnInfo(name = "population")
    private String population;
    @ColumnInfo(name = "Description")
    private String description;
    @ColumnInfo(name = "Surface")
    private String Surface;
    @ColumnInfo(name = "Hymne")
    private int hymne;




    public String getTitle() {
        return title;
    }
    public int getImage() {
        return image;
    }
    public String getPopulation() {
        return population;
    }
    public String getDescription() {
        return description;
    }
    public String getSurface() {
        return Surface;
    }
    public int getHymne(){return hymne;}
    public void setTitle(String title) {
        this.title = title;
    }
    public void setimage(int image) {
        this.image = image;
    }
    public void setPopulation(String pop) {
        this.population = pop;
    }
    public void setDescription(String des) {
        this.description = des;
    }
    public void setSurface(String sur) {
        this.Surface = sur;
    }
    public void setHymne(int hymne){this.hymne=hymne;}


}
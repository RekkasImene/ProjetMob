package com.example.geomob2;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Ressources")
public class Ressources  {

    public Ressources(String title,String ressource) {
        this.title = title;
        this.ressource = ressource;

    }
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "title")
    private String title;
    @ColumnInfo(name = "ressource")
    private String ressource;


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public String getRessource() {
        return ressource;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setRessource(String name) {
        this.ressource = name;
    }
    public void setId(int name) {
        this.id = name;
    }

}

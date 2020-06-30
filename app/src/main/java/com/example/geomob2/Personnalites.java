package com.example.geomob2;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
@Entity(tableName = "Personnalites")
public class Personnalites {


    public Personnalites(String title,String personnalité) {
        this.title = title;
        this.personnalité = personnalité;


    }
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "title")
    private String title;
    @ColumnInfo(name = "personnalité")
    private String personnalité;


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public String getPersonnalité() {
        return personnalité;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setPersonnalité(String name) {
        this.personnalité = name;
    }
    public void setId(int name) {
        this.id = name;
    }




}

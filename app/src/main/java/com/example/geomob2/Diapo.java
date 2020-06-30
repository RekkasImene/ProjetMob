package com.example.geomob2;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Diapo")
public class Diapo {

    public Diapo(String title,int image) {
        this.title = title;
        this.image = image;

    }
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "title")
    private String title;
    @ColumnInfo(name = "image")
    private int image;


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public int getImage() {
        return image;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setImage(int name) {
        this.image = name;
    }
    public void setId(int name) {
        this.id = name;
    }

}


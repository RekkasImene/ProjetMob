package com.example.geomob2;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Historique")
public class Historique {

    public Historique(String title,String hist,String date) {
        this.title = title;
        this.hist = hist;
        this.date=date;
    }
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "title")
    private String title;
    @ColumnInfo(name = "hist")
    private String hist;
    @ColumnInfo(name = "date")
    private String date;


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public String getHist() {
        return hist;
    }
    public String getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setHist(String name) {
        this.hist = name;
    }
    public void setId(int name) {
        this.id = name;
    }
    public void setDate(String name) {
        this.date = name;
    }

}


package com.example.geomob2;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Videos")
public class Videos {

    public Videos(String title,String video) {
        this.title = title;
        this.video = video;

    }
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "title")
    private String title;
    @ColumnInfo(name = "video")
    private String video;


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public String getVideo() {
        return video;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setVideo(String name) {
        this.video = name;
    }
    public void setId(int name) {
        this.id = name;
    }

}

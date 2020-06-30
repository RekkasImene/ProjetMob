package com.example.geomob2;

import android.provider.MediaStore;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

@Dao
public interface VideoDao {

    @Insert
    void insert(Videos i);

    @Query("SELECT * FROM Videos WHERE title LIKE :title")
    List<Videos> getVideos(String title);



}
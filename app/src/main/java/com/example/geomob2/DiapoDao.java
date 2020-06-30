package com.example.geomob2;

import android.provider.MediaStore;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface DiapoDao {

    @Insert
    void insert(Diapo i);

    @Query("SELECT * FROM Diapo WHERE title LIKE :title")
    List<Diapo> getImages(String title);


}

package com.example.geomob2;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

@Dao
public interface RessourceDao {

    @Insert
    void insert(Ressources i);

    @Query("SELECT * FROM Ressources WHERE title LIKE :title")
    List<Ressources> getRessources(String title);



}
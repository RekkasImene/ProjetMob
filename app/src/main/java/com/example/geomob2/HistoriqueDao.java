package com.example.geomob2;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
@Dao
public interface HistoriqueDao {
    @Insert
        void insert(Historique i);

    @Query("SELECT * FROM Historique WHERE title LIKE :title")
        List<Historique> getHistorique(String title);



}

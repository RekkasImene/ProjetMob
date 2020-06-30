package com.example.geomob2;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {Country.class,Personnalites.class,Ressources.class,Videos.class,Diapo.class,Historique.class}, version = 1, exportSchema = false)

public abstract class AppDatabase extends RoomDatabase {
    public abstract CountryDao CountryDao();
    public abstract PersonnaliteDao PersonnalitesDao();
    public abstract RessourceDao RessourcesDao();
    public abstract VideoDao VideoDao();
    public abstract DiapoDao DiapoDao();
    public abstract HistoriqueDao HistoriqueDao();

}
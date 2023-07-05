package com.example.visitortracker.DATABASE;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface VisitorDao {

    @Insert
    public void insertDetail(Visitor visitor);


    @Update
    public void updateDetail(Visitor visitor);

    @Query("SELECT * FROM Visitor")
    List<Visitor> getAllVisitor();

}

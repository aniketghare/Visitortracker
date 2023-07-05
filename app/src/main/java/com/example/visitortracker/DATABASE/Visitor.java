package com.example.visitortracker.DATABASE;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Visitor {
    @PrimaryKey
    public long number;

    @ColumnInfo(name = "Name")
    public String name;

    @ColumnInfo(name = "Address")
    public String Address;


    public Visitor(long number, String name, String address) {
        this.number = number;
        this.name = name;
        Address = address;
    }
}

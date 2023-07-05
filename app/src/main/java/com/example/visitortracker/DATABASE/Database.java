package com.example.visitortracker.DATABASE;


import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {Visitor.class} , version = 1)

public abstract class Database extends RoomDatabase {

   private static final String DB_NAME = "VisitorTracker";

   private static  Database instance;

   public static synchronized Database getDatabase(Context context) {
       if(instance ==null){
           instance = Room.databaseBuilder(context, Database.class, DB_NAME)
                   .fallbackToDestructiveMigration()
                   .fallbackToDestructiveMigration()
                   .allowMainThreadQueries()
                   .build();
       }
       return instance;
   }
   public abstract VisitorDao visitorDao();
}

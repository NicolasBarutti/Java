package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Singleton {

    private static Singleton instance;

    private LocalDateTime createdAt;

    public Singleton(){
        this.createdAt = LocalDateTime.now();

    }

    public  void printCreatedAt(){
        System.out.println(this.createdAt);
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}

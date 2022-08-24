package com.example.remainder;

import javafx.fxml.FXML;

import java.time.format.DateTimeFormatter;

import static java.lang.Thread.sleep;

public class LocalDateTime extends Thread{

    @Override
    public void run(){
        while (true){
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
            java.time.LocalDateTime localDateTime= java.time.LocalDateTime.now();
            String time=dateTimeFormatter.format(localDateTime);
            System.out.println(time);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }



}

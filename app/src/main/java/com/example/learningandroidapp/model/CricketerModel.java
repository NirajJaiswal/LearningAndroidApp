package com.example.learningandroidapp.model;

import java.io.Serializable;

public class CricketerModel implements Serializable {

   private int cricketImage;
    private String cricketName;
    private String cricketAge;

    public CricketerModel(int cricketImage, String cricketName, String cricketAge) {
        this.cricketImage = cricketImage;
        this.cricketName = cricketName;
        this.cricketAge = cricketAge;
    }

    public int getCricketImage() {
        return cricketImage;
    }

    public void setCricketImage(int cricketImage) {
        this.cricketImage = cricketImage;
    }

    public String getCricketName() {
        return cricketName;
    }

    public void setCricketName(String cricketName) {
        this.cricketName = cricketName;
    }

    public String getCricketAge() {
        return cricketAge;
    }

    public void setCricketAge(String cricketAge) {
        this.cricketAge = cricketAge;
    }
}

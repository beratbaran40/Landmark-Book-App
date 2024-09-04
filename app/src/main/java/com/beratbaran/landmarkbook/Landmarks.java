package com.beratbaran.landmarkbook;

import java.io.Serializable;

public class Landmarks implements Serializable {

    String name;
    String country;
    int image;

    //Constructor

    public Landmarks(String name, String country, int image) {
        this.name = name;
        this.country = country;
        this.image = image;



    }


}

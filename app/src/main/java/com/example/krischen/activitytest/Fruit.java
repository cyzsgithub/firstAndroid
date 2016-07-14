package com.example.krischen.activitytest;

import android.widget.FrameLayout;

/**
 * Created by krischen on 16-7-14.
 */
public class Fruit {

    private String name;
    private int imageId;

    public Fruit (String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }
    public String getName() {
        return name;
    }
    public int getImageId() {
        return imageId;
    }
}

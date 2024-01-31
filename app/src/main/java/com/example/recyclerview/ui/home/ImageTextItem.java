package com.example.recyclerview.ui.home;
public class ImageTextItem {

    private int imageResource;
    private String text;


    public ImageTextItem(int imageResource, String text) {
        this.imageResource = imageResource;
        this.text = text;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getText() {
        return text;
    }

}

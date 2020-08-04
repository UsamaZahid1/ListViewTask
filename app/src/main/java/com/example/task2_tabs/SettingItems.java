package com.example.task2_tabs;

public class SettingItems {
    private String name;
    private int img,imgArrow;

    public SettingItems(String name, int img, int imgArrow) {
        this.name = name;
        this.img = img;
        this.imgArrow = imgArrow;
    }
//    public SettingItems(String name, int img) {
//        this.name = name;
//        this.img = img;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getImg() {
//        return img;
//    }

    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }

    public int getImgArrow() {
        return imgArrow;
    }
}

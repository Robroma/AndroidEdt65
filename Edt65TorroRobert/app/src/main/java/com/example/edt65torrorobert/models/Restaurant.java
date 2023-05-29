package com.example.edt65torrorobert.models;

import android.widget.ImageView;

import java.util.ArrayList;

public class Restaurant {
    private String itemName;
    private int itemImage;
    private String itemDescription;
    private String itemRating;
    private String itemType;
    private String itemRange;
    private String itemCity;
    private String itemAddress;
    private String itemTel;
    private ArrayList<Integer> itemImages;

    public Restaurant(String itemName, int itemImage, String itemDescription, String itemRating, String itemType, String itemRange, String itemCity, String itemAddress, String itemTel, ArrayList<Integer> itemImages) {
        this.itemName = itemName;
        this.itemImage = itemImage;
        this.itemDescription = itemDescription;
        this.itemRating = itemRating;
        this.itemType = itemType;
        this.itemRange = itemRange;
        this.itemCity = itemCity;
        this.itemAddress = itemAddress;
        this.itemTel = itemTel;
        this.itemImages = itemImages;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemImage() {
        return itemImage;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemRating() {
        return itemRating;
    }

    public String getItemType() {
        return itemType;
    }

    public String getItemRange() {
        return itemRange;
    }

    public String getItemCity() {
        return itemCity;
    }

    public String getItemAddress() {
        return itemAddress;
    }

    public String getItemTel() {
        return itemTel;
    }

    public ArrayList<Integer> getItemImages() {
        return itemImages;
    }
}

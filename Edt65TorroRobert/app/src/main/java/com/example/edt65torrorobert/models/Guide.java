package com.example.edt65torrorobert.models;

import java.util.ArrayList;

public class Guide {
    private String guideName;
    private String guideCity;
    private String guidePrice;
    private int guideImage;
    private String guideDesc;
    private ArrayList<Integer> guideImages;

    public Guide(String guideName, String guideCity, String guidePrice, int guideImage, String guideDesc, ArrayList<Integer> guideImages) {
        this.guideName = guideName;
        this.guideCity = guideCity;
        this.guidePrice = guidePrice;
        this.guideImage = guideImage;
        this.guideDesc = guideDesc;
        this.guideImages = guideImages;
    }

    public String getGuideName() {
        return guideName;
    }

    public String getGuideCity() {
        return guideCity;
    }

    public String getGuidePrice() {
        return guidePrice;
    }

    public int getGuideImage() {
        return guideImage;
    }

    public String getGuideDesc() {
        return guideDesc;
    }

    public ArrayList<Integer> getGuideImages() {
        return guideImages;
    }
}

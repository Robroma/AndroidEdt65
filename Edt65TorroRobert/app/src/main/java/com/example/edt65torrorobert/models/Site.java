package com.example.edt65torrorobert.models;

import java.util.ArrayList;

public class Site {
    private String siteName;
    private String siteCity;
    private String sitePrice;
    private int siteImage;
    private ArrayList<Integer> siteImages;

    public Site(String siteName, String siteCity, String sitePrice, int siteImage, ArrayList<Integer> siteImages) {
        this.siteName = siteName;
        this.siteCity = siteCity;
        this.sitePrice = sitePrice;
        this.siteImage = siteImage;
        this.siteImages = siteImages;
    }

    public String getSiteName() {
        return siteName;
    }

    public String getSiteCity() {
        return siteCity;
    }

    public String getSitePrice() {
        return sitePrice;
    }

    public int getSiteImage() {
        return siteImage;
    }

    public ArrayList<Integer> getSiteImages() {
        return siteImages;
    }
}

package com.example.edt65torrorobert.utils;

import com.example.edt65torrorobert.R;
import com.example.edt65torrorobert.models.Guide;
import com.example.edt65torrorobert.models.Restaurant;
import com.example.edt65torrorobert.models.Site;

import java.util.ArrayList;

public class InfoRecycler {
    private ArrayList<Restaurant> restaurants = new ArrayList<>();
    private ArrayList<Site> sites = new ArrayList<>();
    private ArrayList<Guide> guides = new ArrayList<>();


    public ArrayList<Restaurant> getRestaurants() {
        ArrayList<Integer> images1 = new ArrayList<>();
        images1.add(R.drawable.rest1a);
        images1.add(R.drawable.rest1b);
        images1.add(R.drawable.rest1c);
        restaurants.add(new Restaurant("Restaurant 1", R.drawable.rest1,"This is an amazing Asian Food restaurant in the heart of Barcelona, in front of the marina street","4/5","Asian","$30-$45", "Barcelona", "Marina St,45", "+34 555 555 555", images1));

        ArrayList<Integer> images2 = new ArrayList<>();
        images2.add(R.drawable.rest2a);
        images2.add(R.drawable.rest2b);
        restaurants.add(new Restaurant("Restaurant 2", R.drawable.rest2,"This is a wonderful Italian restaurant in the center of Madrid","4.5/5","Italian","$25-$40", "Madrid", "Main St,100", "+34 555 555 556", images2));

        ArrayList<Integer> images3 = new ArrayList<>();
        images3.add(R.drawable.rest3a);
        restaurants.add(new Restaurant("Restaurant 3", R.drawable.rest3,"This is a traditional Spanish restaurant in Sevilla","4.2/5","Spanish","$20-$35", "Sevilla", "Sevilla St,80", "+34 555 555 557", images3));

        ArrayList<Integer> images4 = new ArrayList<>();
        images4.add(R.drawable.rest4a);
        images4.add(R.drawable.rest4b);
        restaurants.add(new Restaurant("Restaurant 4", R.drawable.rest4,"This is a gourmet French restaurant in Valencia","4.7/5","French","$50-$75", "Valencia", "Valencia St,60", "+34 555 555 558", images4));

        ArrayList<Integer> images5 = new ArrayList<>();
        images5.add(R.drawable.rest5a);
        images5.add(R.drawable.rest5b);
        restaurants.add(new Restaurant("Restaurant 5", R.drawable.rest5,"This is a popular American restaurant in Bilbao","4.3/5","American","$15-$30", "Bilbao", "Bilbao St,40", "+34 555 555 559", images5));

        ArrayList<Integer> images6 = new ArrayList<>();
        images6.add(R.drawable.rest6a);
        images6.add(R.drawable.rest6b);
        restaurants.add(new Restaurant("Restaurant 6", R.drawable.rest6,"This is a cozy Mexican restaurant in Granada","4.1/5","Mexican","$20-$40", "Granada", "Granada St,35", "+34 555 555 560", images6));

        ArrayList<Integer> images7 = new ArrayList<>();
        images7.add(R.drawable.rest7a);
        images7.add(R.drawable.rest7b);
        restaurants.add(new Restaurant("Restaurant 7", R.drawable.rest7,"This is a delightful Greek restaurant in Málaga","4.6/5","Greek","$25-$50", "Málaga", "Málaga St,75", "+34 555 555 561", images7));

        return restaurants;
    }

    public ArrayList<Guide> getGuides() {
        ArrayList<Integer> images = new ArrayList<>();
        images.add(R.drawable.m1a1);
        images.add(R.drawable.m1a2);
        images.add(R.drawable.m1a3);
        images.add(R.drawable.m1a4);
        images.add(R.drawable.m1a5);
        guides.add(new Guide("MACBA","Barcelona","12$",R.drawable.m1,"Welcome to MACBA, a space for discovery and shared knowledge in Barcelona's Raval neighbourhood. Come and visit a collection of iconic pieces that represent key moments in the century of art, culture and society.",images));

        images = new ArrayList<>();
        images.add(R.drawable.m2a1);
        images.add(R.drawable.m2a2);
        images.add(R.drawable.m2a3);
        guides.add(new Guide("MNAC","Barcelona","Free",R.drawable.m2,"Welcome to MNAC, a space for discovery and shared knowledge in Barcelona's. Come and visit a collection of iconic pieces that represent key moments in the century of art, culture and society.",images));

        images = new ArrayList<>();
        images.add(R.drawable.m3a1);
        images.add(R.drawable.m3a2);
        images.add(R.drawable.m3a3);
        guides.add(new Guide("Disseny Museu","Barcelona","15$",R.drawable.m3,"Welcome to Disseny Museu, a space for discovery and shared knowledge in Barcelona's. Come and visit a collection of iconic pieces that represent key moments in the century of art, culture and society.",images));

        images = new ArrayList<>();
        images.add(R.drawable.m4a1);
        images.add(R.drawable.m4a2);
        guides.add(new Guide("Museu Ciencies Naturals","Barcelona","10$",R.drawable.m4,"Welcome to Museu Ciencies Naturals, a space for discovery and shared knowledge in Barcelona's. Come and visit a collection of iconic pieces that represent key moments in the century of art, culture and society.",images));

        images = new ArrayList<>();
        images.add(R.drawable.m5a1);
        images.add(R.drawable.m5a2);
        guides.add(new Guide("MoCo Museum","Barcelona","10$",R.drawable.m5,"Welcome to MoCo Museum, a space for discovery and shared knowledge in Barcelona's. Come and visit a collection of iconic pieces that represent key moments in the century of art, culture and society.",images));

        images = new ArrayList<>();
        images.add(R.drawable.m6a1);
        images.add(R.drawable.m6a2);
        guides.add(new Guide("Picasso Museu","Barcelona","10$",R.drawable.m6,"Welcome to Picasso Museu, a space for discovery and shared knowledge in Barcelona's. Come and visit a collection of iconic pieces that represent key moments in the century of art, culture and society.",images));


        return guides;
    }

    public ArrayList<Site> getSites() {
        ArrayList<Integer> images1 = new ArrayList<>();
        images1.add(R.drawable.site1a);
        images1.add(R.drawable.site1b);
        images1.add(R.drawable.site1c);
        sites.add(new Site("Sagrada Familia", "Barcelona","21$",R.drawable.site1,images1 ));

        images1 = new ArrayList<>();
        images1.add(R.drawable.site2a);
        images1.add(R.drawable.site2b);
        images1.add(R.drawable.site2c);
        sites.add(new Site("Parc Guell", "Barcelona","18$",R.drawable.site2,images1 ));

        images1 = new ArrayList<>();
        images1.add(R.drawable.site3a);
        images1.add(R.drawable.site3b);
        images1.add(R.drawable.site3c);
        sites.add(new Site("Estadi Olimpic", "Barcelona","12$",R.drawable.site3,images1 ));

        images1 = new ArrayList<>();
        images1.add(R.drawable.site4a);
        images1.add(R.drawable.site4b);
        sites.add(new Site("Museu Macba", "Barcelona","8$",R.drawable.site4,images1 ));

        images1 = new ArrayList<>();
        images1.add(R.drawable.site5a);
        images1.add(R.drawable.site5b);
        sites.add(new Site("Casa Batllo", "Barcelona","8$",R.drawable.site5,images1 ));

        return sites;
    }
}

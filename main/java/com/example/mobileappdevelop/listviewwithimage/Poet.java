package com.example.mobileappdevelop.listviewwithimage;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 27-6-16.
 */
public class Poet {
    String name;
    String country;
    String district;

    ArrayList<Poet> poetsList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Poet> getPoetsList() {
        return poetsList;
    }

    public void setPoetsList(ArrayList<Poet> poetsList) {
        this.poetsList = poetsList;
    }

    public String getCountry() {

        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Poet(String name, String country, String district) {
        this.name = name;
        this.country = country;
        this.district = district;
    }

    public Poet() {
    }

    @Override
    public String toString() {
        return getName();
    }

    public ArrayList<Poet> getAllPoets(){
        poetsList = new ArrayList<>();
        poetsList.add(new Poet("Kamal","Bangladesh","Dhaka"));
        poetsList.add(new Poet("Jamal","Bangladesh","Comilla"));
        poetsList.add(new Poet("Bimol","Bangladesh","Khulna"));
        poetsList.add(new Poet("Komol","Bangladesh","Chittagong"));
        return poetsList;
    }
}

package com.example.quakereport;


public class Earthquake {
    private String Place;
    private double mag;
    private long milliseconds;
    private String Url;



    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mag = magnitude;
        Place = location;
        milliseconds = timeInMilliseconds;
        Url=url;
    }

    public String getPlace() {
        return Place;
    }

    public String getUrl(){return Url;}
    public double getMag() {
        return mag;
    }

    public long getMilliseconds() {
        return milliseconds;
    }

}

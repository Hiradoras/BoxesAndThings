package com.company;

public class CD implements ToBeStored{
    private String artist;
    private String name;
    private Integer publishingYear;
    private Double weight = 0.1;
    public CD(String artist, String name, Integer publishingYear){
        this.artist = artist;
        this.name = name;
        this.publishingYear = publishingYear;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s: %s (%d)", artist, name, publishingYear);
    }
}

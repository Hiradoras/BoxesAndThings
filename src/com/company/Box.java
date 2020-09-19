package com.company;

import java.util.ArrayList;

public class Box implements ToBeStored{
    private double capacity;
    private double currentWeight = 0f;
    private int count = 0;
    @Override
    public double weight() {
        return 0;
    }
    public Box(double capacity){
        this.capacity = capacity;
    }
    public void add(Book book){
        if (currentWeight+book.weight() <= capacity) {
            currentWeight += book.weight();
            count++;
        }
    }
    public  void add(CD cd){
        if (currentWeight+cd.weight() <= capacity) {
            currentWeight += cd.weight();
            count++;
        }
    }
    @Override
    public String toString() {
        return String.format("Box: %s things, total weight %.1f kg",count,currentWeight);
    }
}

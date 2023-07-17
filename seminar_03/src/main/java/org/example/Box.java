package org.example;
public class Box {
    private int weight;

    public Box (int weight) {
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    @Override
    public String toString() {
        return "коробка весит " + weight;
    }
}
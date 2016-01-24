package com.levelup;


public class Rictangle extends Shape {
    private double weight;
    private double height;

    public Rictangle() {
    }

    public Rictangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateSquare() {
        return weight*height;
    }


}

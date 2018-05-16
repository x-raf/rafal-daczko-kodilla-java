package com.kodilla.testing.shape;

public class Square implements Shape {
    private double x;

    public Square(double x) {
        this.x = x;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public Double getField() {
        return x*x;
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + x +
                ", area=" + getField()+
                '}';
    }
}

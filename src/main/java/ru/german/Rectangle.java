package ru.german;

public class Rectangle implements Figure {
    private double height;
    private double weight;

    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double getArea() {
        return height * weight;
    }

    @Override
    public double getPerimeter() {
        return (height + weight) * 2 ;
    }

    @Override
    public String toString() {
        return "Прямоугольник {" +
                "высота=" + height +
                ", ширина=" + weight +
                '}';
    }
}

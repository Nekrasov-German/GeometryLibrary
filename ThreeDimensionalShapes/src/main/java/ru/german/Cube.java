package ru.german;

public class Cube {
    private double x;
    private double y;
    private double z;

    public Cube(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getVolume() {
        return x * y * z;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "ширина=" + x +
                ", высота=" + y +
                ", глубина=" + z +
                ", объем=" + getVolume() +
                '}';
    }
}

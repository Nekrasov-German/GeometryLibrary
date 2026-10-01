package ru.german;

public class Sphere {
    private double radius;

    public Sphere(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть положительным");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double getSurfaceArea() {
        return 4.0 * Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                ", volume=" + getVolume() +
                ", surface area=" + getSurfaceArea() +
                '}';
    }
}

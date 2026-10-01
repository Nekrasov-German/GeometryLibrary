package ru.german;

public class FigureUtil {
    public boolean compareArea(Figure a, Figure b) {
        if (a.getArea() == b.getArea()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comparePerimeter(Figure a, Figure b) {
        if (a.getPerimeter() == b.getPerimeter()) {
            return true;
        } else {
            return false;
        }
    }
}

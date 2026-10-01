package ru.german;

public class FigureUtil {
    public String compareArea(Figure a, Figure b) {
        if (a.getArea() == b.getArea()) {
            return "Площади фигур равны.";
        } else {
            return "Площади фигур не равны, разница = " + (a.getArea() - b.getArea());
        }
    }

    public String comparePerimeter(Figure a, Figure b) {
        if (a.getPerimeter() == b.getPerimeter()) {
            return "Периметры равны.";
        } else {
            return "Периметры не равны разница = " + (a.getPerimeter() - b.getPerimeter());
        }
    }
}

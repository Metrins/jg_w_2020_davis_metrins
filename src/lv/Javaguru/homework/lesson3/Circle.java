package lv.Javaguru.homework.lesson3;

public class Circle {
    // PR kvadrātā
    // pi 3.14159265
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateField() {
        return 3.14159265D * radius * radius;
    }
}
package ss6_inheritance.exercise.cricle_cylinder;

public class Cricle {
    private String color;
    private double radius;
    final double PI = 3.14;

    public Cricle() {

    }

    public Cricle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getAre() {
        return radius * radius * PI;
    }

    public double getPerimeter() {
        return radius * 2 * PI;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "color='" + getColor() + '\'' +
                ", radius=" + getRadius() +
                '}';
    }
}

package ss5_access_modifier_and_static.exercise.cricle;

public class Cricle {
    private double radius = 1.0;
    private String color = "red";
    final double PI = 3.14;

    public Cricle() {
    }

    public Cricle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    public String toString() {
        return "Fan {" + " radius is " + getRadius() +
                ", area= " + getArea() +
                '}';
    }

}

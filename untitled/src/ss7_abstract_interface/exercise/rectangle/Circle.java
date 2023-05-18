package ss7_abstract_interface.exercise.rectangle;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;
    private final double PI = 3.14;


    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius*this.radius;
    }

    public double getPerimeter(){
        return 2*radius*PI;
    }

    @Override
    public void resizeable(double percent) {
        setRadius(getRadius()+getRadius()*percent/100);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                 ", which is a subclass of "
                + super.toString();
    }
}

package ss7_abstract_interface.exercise.rectangle;

public class Rectangle extends Shape implements Resizeable {
    private double wight = 1.0;
    private double height = 1.0;

    public Rectangle(double wight, double height) {
        this.wight = wight;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double wight, double height) {
        super(color, filled);
        this.wight = wight;
        this.height = height;
    }

    public Rectangle() {
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.wight * this.height;
    }

    public double getPerimeter() {
        return (this.height + this.wight) * 2;
    }

    @Override
    public double resizeable(double percent) {
      return getArea()+getArea()*percent/100;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "wight=" + getWight() +
                ", height=" + getHeight() +
                ", which is a subclass of "
                + super.toString();
    }
}

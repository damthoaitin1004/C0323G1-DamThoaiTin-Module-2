package ss7_abstract_interface.exercise.rectangle;



public class Square extends Shape implements Resizeable {
    private double edge = 1.0;

    public Square() {
    }

    public Square(String color, boolean filled) {
        super(color, filled);
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return this.edge * this.edge;
    }

    @Override
    public double getPerimeter() {
        return this.edge * 4;
    }

    @Override
    public void resizeable(double percent) {
        System.out.println(getArea()+getArea()*percent/100);
    }

    public String toString() {
        return "Rectangle{" +
                "edge=" + getEdge() +
                ", which is a subclass of "
                + super.toString();

    }
}

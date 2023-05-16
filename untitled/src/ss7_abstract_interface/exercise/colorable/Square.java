package ss7_abstract_interface.exercise.colorable;

public class Square extends Shape implements Colorable {
    private double edge = 1.0;

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }
     public Square(){

     }
    public double getEdge() {
        return edge;
    }

    @Override
    public void howToColor(String color) {
        System.out.println(color +" all four sides: ");
    }

    @Override
    public double getArea() {
        return this.edge*this.edge;
    }

    @Override
    public double getPerimeter() {
        return this.edge*4;
    }

    public String toString() {
        return "Rectangle{" +
                "edge=" + getEdge() +
                ", which is a subclass of "
                + super.toString();

    }

}

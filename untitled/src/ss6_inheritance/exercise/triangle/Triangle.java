package ss6_inheritance.exercise.triangle;

public class Triangle extends Shape {
    private double sideA = 1.0;
    private double sideB = 1.0;
    private double sideC = 1.0;


    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(String color, boolean filled, double sideA, double sideB, double sideC) {
        super(color, filled);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public Triangle() {
    }

    public double getPerimeter(){
        return sideA+sideB+sideC;
    }

    public double getArea() {

        return Math.sqrt(getPerimeter()/2 * (getPerimeter()/2 - this.sideA) * (getPerimeter()/2 - this.sideB) * (getPerimeter()/2 - this.sideC));

    }


    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + getSideA() +
                ", sideB=" + getSideB() +
                ", sideC=" + getSideC() +
                " area "+getArea()+
                " perimeter "+getPerimeter()+
                " color "+ getColor()+
                '}';
    }
}




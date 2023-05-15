package ss6_inheritance.exercise.cricle_cylinder;



public class Cylinder extends Cricle {
    private double height=0.0;

    public Cylinder() {
    }

    public Cylinder(double radius, double height, String color) {
        super(color, radius);

        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getVolumetric() {
        return height * getAre();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() +
                ", color='" + getColor() + '\'' +
                ", radius=" + getRadius() +
                '}';
    }
}

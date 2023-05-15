package ss6_inheritance.exercise.point;

public class Main {
    public static void main(String[] args) {
      Point2D point2D=new Point2D(3.5f,5.4f);
      Point3D point3D=new Point3D(5.6f,6.5f,4.5f);
      point2D.setX(1.2f);
        System.out.println(point2D.getX());
      point3D.setX(2.2f);
        System.out.println(point3D.getX());
        point2D.setXY(3.5f,4.3f);
        point3D.setXYZ(2.0f,3.6f,5.3f);
        System.out.println(point2D.toString());
        System.out.println(point3D.toString());


    }
}

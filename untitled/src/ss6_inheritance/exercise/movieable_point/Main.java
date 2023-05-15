package ss6_inheritance.exercise.movieable_point;
public class Main {
    public static void main(String[] args) {
        Point point = new Point(2.3f,4.2f);
        MoveablePoint moveablePoint = new MoveablePoint(3.2f,6.2f,3.2f,6.5f);
        point.setXY(3.4f,3.4f);
        System.out.println(point.toString());
        moveablePoint.setSpeed(3.2f,4.2f);
        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}

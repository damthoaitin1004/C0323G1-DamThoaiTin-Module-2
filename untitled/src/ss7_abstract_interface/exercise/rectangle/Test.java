package ss7_abstract_interface.exercise.rectangle;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Black", true, 3.5);
        shapes[1] = new Rectangle("Red", true, 5.3, 3.4);
        shapes[2] = new Square("Yellow", true, 5.3);

        for (Shape shape : shapes) {
            System.out.println("Please press the number to change the shape");
            number = Double.parseDouble(scanner.nextLine());
            if ((number > 0) && (number <= 100)) {
                System.out.println(shape.toString() + " Area is: " + shape.getArea());
                System.out.print("Area after change is: ");
                shape.resizeable(number);
            }else {
                System.out.println("You entered it wrong");
            }
        }

    }
}

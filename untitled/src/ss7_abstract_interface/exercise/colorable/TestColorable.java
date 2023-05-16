package ss7_abstract_interface.exercise.colorable;

public class TestColorable {
    public static void main(String[] args) {


        Shape[] shapes = new Shape[3];
        shapes[0]=new Circle(3.5,"Red",true);
        shapes[1]=new Square("Yellow",true,4.6);
        shapes[2]=new Rectangle(5.6,4.5,"Black",true);

       for(Shape shape: shapes){
           if (shape instanceof Colorable){
               System.out.println(shape.getArea());
               ((Colorable) shape).howToColor(shape.getColor());
           }
       }

    }
}

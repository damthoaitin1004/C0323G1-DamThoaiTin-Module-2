package ss5_access_modifier_and_static.exercise.cricle;

import java.util.Scanner;

public class TestCricle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cricle cricle = new Cricle();
        Cricle cricleA = new Cricle(4.6);
      System.out.println("Press the number to see the information of each circle: ");
      System.out.println("1.cricleA "+cricle.toString());
      System.out.println("2.cricleB "+cricleA.toString());
      System.out.println("Please enter number ");
         int number = Integer.parseInt(scanner.nextLine());
         if (number==1){
             System.out.println("crileA\n" +
                     "radius is "+cricle.getRadius()+"\n"+
                     "area of cricle is: "+cricle.getArea());
         }else if (number==2){
             System.out.println("crileA\n" +
                     "radius is "+cricleA.getRadius()+"\n"+
                     "area of cricle is: "+cricleA.getArea());
         }
    }
}

package ss4_oop.exercise.machine_fan;

public class Fan {

    int speed = 2;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public Fan(boolean on,int speed,double radius,String color) {
      this.on=on;
      this.speed=speed;
      this.radius=radius;
      this.color=color;
    }

    public int GetSpeed() {
        return this.speed;
    }

    public void  SetSpeed(int num) {
        this.speed = num;
    }

    public boolean GetOn() {
        return this.on;
    }
    public void SetOn(boolean on){
        this.on = on;
    }
    public double GetRadius(){
        return this.radius;
    }
    public void SetRadius(int number ){
        this.radius= number;
    }
    public String GetColor(){
       return this.color;
    }
    public void SetColor(String color){
        this.color = color;
    }


    public String toString() {
        return "Fan {" +" fan is "+on+
                " speed= '" + speed + '\'' +
                ", color= '" + color + '\'' +
                ", radius= " + radius +
                '}';
    }

}

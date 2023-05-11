package ss4_oop.exercise.equation;

public class QuadraticEquation {
    double numberA, numberB, numberC;

    public QuadraticEquation(double numberA, double numberB, double numberC) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
    }

    public double getDelta() {
        return (this.numberB * this.numberB) -( 4 * this.numberA * this.numberC);
    }

    public double getSameRoot() {
        return (-numberB) / (2 * numberA);
    }

    public double getRootA() {
        return ((-numberB) + Math.pow(getDelta(), 0.5)) / 2 * numberA;
    }

    public double getRootB() {
        return( (-numberB) - Math.pow(getDelta(), 0.5))/ 2 * numberA;
    }
}

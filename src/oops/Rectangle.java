package oops;

public class Rectangle {
    private double l;
    private double b;

    double area(){
        return l*b;
    }

    public double getL() {
        return l;
    }

    public double getB() {
        return b;
    }

    public void setL(double l) {
        this.l = l;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }
}

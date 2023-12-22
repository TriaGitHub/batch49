package oops;

public class RectangleDriverCode {

    public static void main(String[] args) {

       // Rectangle rectangle = new Rectangle();
       // System.out.println(rectangle.area());

        //Rectangle rectangle = new Rectangle(2,3);
        //System.out.println(rectangle.area());

        Rectangle rectangle = new Rectangle(2,3);
        System.out.println(rectangle.getB());
        rectangle.setL(5);
        System.out.println(rectangle.getL());
    }
}

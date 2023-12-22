public class Circle {

    private static final double PI = 3.14;

    // other way to static initialization
    //    private static final double PI;
    //    static {
    //        PI = 3.14;
    //    }

    //Below is static method
    private static void staticTest1(){
        System.out.println("In method 1");
        staticTest2(); // calling another static method, because its already loaded in the memory
    }

    private static void staticTest2(){
        System.out.println("In method 2");
        staticTest1();
    }
    private double radius;
    private String name;

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double area() {
        return PI * radius * radius;

    }

    public double circumference() {
        return 2 * PI * radius;
    }
}

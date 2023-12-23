public class Calculator {
    public static void main(String[] args) {
        System.out.println("Just print Triaal");

        System.out.println("Sum is :"+sum(2,3));

        int d = deduction(5, 2);
        System.out.println("Deduction is :" + d);

        int m = multiply(5, 5);
        System.out.println("Multiplication is :" + m);

        int di = divide(10, 5);
        System.out.println("Divide is :" + di);
        System.out.println("Divide is :" + di);
    }

    public static int sum(int a, int b) {
        return a + b;

    }

    public static int deduction(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }


}

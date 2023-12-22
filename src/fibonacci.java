public class fibonacci {

    /*public static void main(String[] args) {
        int n = 7;
        if (n<0)
            System.out.println("Fibonacci number is not defined");
        else
            System.out.println(fib(n));
    }

    public static int fib(int m) {
        if (m<=1)
            return m;
        else
            return fib(m-1) + fib(m-2);
    }*/

    // Simplest Way for Fibonacci

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int n = 10;
        System.out.println(a);
        System.out.println(b);

        for (int i = 3; i <= 10; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }


}

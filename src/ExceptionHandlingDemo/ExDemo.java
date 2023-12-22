package ExceptionHandlingDemo;

public class ExDemo {

    public static void main(String[] args) {

        try {

            int[] ai = new int[2];
            ai[6] = 80; //Array out of Bound Exception
            System.out.println("Success");
        } catch (Exception ex) {
            System.out.println("This index is not present in array");
        }

        test();
//        String s = null;
//        System.out.println(s.toLowerCase()); // Compiler don't know that object is null

    }

    public static void test() throws ArithmeticException {
        try {
            int x = 2/3;
            System.out.println("Hello");

           // System.out.println(2 / 0); //Airthmatic Exception
        } catch (ArithmeticException e) {
            System.out.println("cant divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("This index is not present in array.");
        }

    }
}

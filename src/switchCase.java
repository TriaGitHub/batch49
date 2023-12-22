import java.util.Scanner;

public class switchCase {

    public static void main(String[] args) {

        String m1 = "+";
        String m2 = "-";
        String m3 = "*";
        String m4 = "/";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter 2 Number:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Which Math Calculation do you want to do (+,-,*,/):");
        String math = sc.next();

        switch (math) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid Input");


        }
        System.out.println("End of Calculation.");

    }
}

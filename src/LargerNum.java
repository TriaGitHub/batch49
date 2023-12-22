//Find out the largest entered number using if else if

import java.util.Scanner;

public class LargerNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {

            System.out.println("the largest number is :" + num1);

        } else if (num2 > num3) {

            System.out.println("The largest number is :" + num2);

        } else
            System.out.println("The largest number is :" + num3);

    }
}

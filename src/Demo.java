import java.util.Arrays;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter Int Number:");
        int input = sc.nextInt();
        System.out.println("You have ENTERED:" +input);*/

        // Code for print odd number between 1 to 100

        /*for (int i = 1; i <= 100; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }*/

        // Write code to do sum of even number
        /*int sum = 0;
        for (int i =1;i<=10;i++){
            if (i%2==0){
            sum = sum +i;}

        }
        System.out.println(sum);*/

/*
        //Draw a star
        for (int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


      // factorial number
        int i, fact =1;
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for find factorial:");
        num = sc.nextInt();

        for (i=1;i<=num;i++){
            fact = fact * i;

        }
        System.out.println("Factorial of your number "+num+" is :"+fact);

      //  Scanner sc = new Scanner(System.in);
       // int anInt = sc.nextInt();
*/
   /*   // print random number
        int random =(int)(Math.random()*10);
        System.out.println(random);

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag){
            System.out.println("Guess the Number:");
            int anInt = sc.nextInt();
            if (random == anInt){
                System.out.println("Right Guess!! You Win.");
                flag = false;
            }
            else {
                if (random<anInt){
                    System.out.println("Please enter the LOWER number and Try again... ");
                }
                else {
                    System.out.println("Please enter the HIGHER number and Try again...");
                }

                //System.out.println("try again...");
            }
        }*/
 /*// Difference between do and while loop.
        int i=1;
        while(i<0){
            System.out.println(i++);
        }

        do {
            System.out.println(i++);
        }while(i<0);
*/
   /*     // Switch case demo
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month:");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(" Month has 31 days");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Month has 30 days");
                break;

            case 2:
                System.out.println("Month has 28 days");
                break;

            default:
                System.out.println("invalid Number of Month");
        }
        System.out.println("End");
    }*/
String s ="David";
        String s4 = "This is a Java Class";
        String[] splitArray = s4.split(" ");
        System.out.println(Arrays.toString(splitArray));
    }
}
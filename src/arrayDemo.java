import java.util.Scanner;

public class arrayDemo {
    public static void main(String[] args) {


        // Define array in different way
     /*
        int[] arr = new int[5];
        int[] arr1 = new int[]{10,10,20,31,21};
        int[] arr2 = {10,10,20,31,21}; // behind the scene it will automatically take new int[]


      */
       /* Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Please enter your 5 subject marks:");
        for (int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();

        }

        int sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        System.out.println("Total marks of 5 subjects is :"+ sum);


        */
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][5];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Student no. " + (i + 1) + " Marks of 5 subject:");
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        System.out.println("You have entered as following: ");
        for (int i=0;i< arr.length;i++){
            System.out.print("Student "+(i+1)+" Marks of 5 subject : ");
            for (int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int sum;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < 5; j++) {

                sum = sum + arr[i][j];

            }
            System.out.println("Stuent " + (i + 1) + " total marks is : " + sum);

        }


        for (int j=0;j<5;j++){
            sum =0;
            for (int i=0;i<3;i++){
                sum = sum + arr[i][j];
            }
            System.out.println((j+1)+"st Colum sum is : "+sum);
        }
    }
}

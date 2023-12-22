public class oddEvenRange {

    public static void main(String[] args) {
        int number = 15;
        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
        range(49);
    }

    public static void range(int x) {

        if (x>=50 && x<=100){
            System.out.println("Number is between 50 and 100");
        }
        else {
            System.out.println("Number is not in a Range");
        }

    }
}
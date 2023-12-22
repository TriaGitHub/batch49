public class primenum {

    public static void main(String[] args) {

        int i,j,ch;

        System.out.println("Prime number from 1 to 100 is :");

        for (i=2;i<=100;i++){
            ch = 0;
            for (j=2;j<i;j++){
                if (i%j==0){
                    ch++;
                    break;
                }
            }
            if (ch==0)
                System.out.println(i);
        }
    }
}

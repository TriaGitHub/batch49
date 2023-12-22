import java.util.Arrays;

public class stringDemo {

    public static void main(String[] args) {

        // Both defining variable way are same. No difference.
        String s = "David";
        int j=3;
        System.out.println(s.substring(0, j) + s.substring(j + 1)); // extracting firs and end part from index point we want to remove and then combine it
        System.out.println(s.contains("av"));
        System.out.println(s.replace("Da", "Ab"));
        System.out.println(s.indexOf("i"));
        System.out.println(s.startsWith("a"));
        System.out.println(s.trim()); // trimming extra white spaces
        System.out.println(s.toUpperCase());
        System.out.println(s.concat(" Patel"));
        System.out.println(s.isEmpty()); // checking string is Empty or not
        System.out.println(s.getBytes());
        System.out.println(s.substring(2)); // print string starting index 2
        System.out.println(s.charAt(3)); // character at particular index
        System.out.println(s.toCharArray()); // wrapping the data with []

        char[] chars = s.toCharArray(); // storing the string "David" as array in variable ch.
        System.out.println(chars[0]);

        // david to d i v a d
        int start = 0;
        int end = s.length() - 1;
        char temp;
        while (start < end) {

            temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        System.out.println("reversed string is:");
        System.out.println(new String(chars));

        String s4 = "This is a Java Class";
        String[] splitArray = s4.split(" ");
        System.out.println(Arrays.toString(splitArray));


        String s1 = new String("David");
        String s2 = new String("David");

        System.out.println(s.substring(0, 2)); // will go until index 2 but print only until last index 1

        System.out.println(s.concat(" Patel"));

        String s3 = s.concat(" Patel"); // New object create in HEAP area and returning it.
        System.out.println(s3);


        System.out.println(s1 == s2); // check references are equal or not
        System.out.println(s1.equals(s2)); // check their inner value and compare

        // StringBuilder is mutuable where as STRING is imumutable. Using a String builder, its return its self object with same reference point. NOT Creating another new object as STRING do.
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c"); // you can call append method unlimited times.
        System.out.println(sb);

        int x=10;
        Integer integerVar = new Integer(10);
        Double d = 12222222.122;
        System.out.println(d.shortValue());
        //  Integer integerVar = 10; // --- define as another way .. Automatically take new integer
        int i1 = integerVar.intValue(); // Integer to int convert

        System.out.println(integerVar.floatValue()); // Integer to Float value

        String s5 = integerVar.toString();
        System.out.println(s5); // converting to string "10". no more int 10

        String s6 ="430";
        int anInt = Integer.parseInt(s6); //  parseInt convert string to int
        System.out.println(anInt+1);

        // you dont need to create a object to use static method such as pasreInt

        int anInt1 = Integer.parseInt("345");
        System.out.println(anInt1+3);

        int a = 10;
        Integer integer = Integer.valueOf(a);
        System.out.println(integer);

        Integer i =10;
        i.intValue();

    }
}

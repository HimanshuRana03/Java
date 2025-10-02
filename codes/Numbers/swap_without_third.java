package codes.Numbers;
import java.util.*;
public class swap_without_third {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
       //using add and sub
        // a=a+b;
        // b=a-b;
        // a=a-b;
        //using xor
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("the value of first numbe is "+a);
        System.out.println("the value of second number is "+b);
    }
}

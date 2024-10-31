import java.util.*;
public class methods {
    static int avg(int a,int b)
    {
        return (a+b)/2;
    }
    static void greet()//called method
    {
        System.out.println("hello Himanshu Here");
    }    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        greet();//calling method
        int av=avg(2,3);
        System.out.println("the average is "+av);
        System.out.println("the minimum number is "+Math.min(5, 6));
        System.out.println(Math.round(2.5));
        sc.close();
    }
   
}

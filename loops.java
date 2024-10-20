import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //System.out.println("enter a number\n");
       /*  int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(i+1);
        }
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        } 

        int i=0;
        while(i<n)
        {
            System.out.println(i);
            i++;
        }
        */
        boolean val=true;
        do{
            System.out.println("val is true");
            System.out.println("is val not false");
            val=sc.nextBoolean();           
        }while(val);
        System.out.println("val is false now");
        //System.out.println("the sum of numbers is = "+sum);
        sc.close();
    }
}

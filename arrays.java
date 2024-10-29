import java.util.*;
public class arrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int age[]= new int[n];
        //int age[]={10,20,30,40};
        for(int i=0;i<n;i++)
        {
            age[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=age[i];
        }
        for(int ages:age)
        {
            System.out.println("age is"+ages);
        }

        int arr[][]=new int[5][3];
        for(int i=0;i<5;i++)
        {
            System.out.println("enter the 3 marks of student "+(i+1));
            for(int j=0;j<3;j++)
            {

                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("marks of student "+(i+1)+"is");
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println(sum);

        sc.close();
    }
}

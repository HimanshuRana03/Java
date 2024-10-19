import java.util.Scanner;
public class conditionals {
public static void main(String[] args) {
    /*int age=2;
    if(age>=18)
    {
        System.out.println("you can vote");

    }
    else{
        System.out.println("you cannot vote");
    }
    */
    /*int a=2,b=3,c=4;
    if(a>b)
    {
        System.out.println("a is greater than b");
        if(a<c)
        {
            System.out.println("c is greater than a");
        }
        else{
            System.out.println("a is greater than c");
        }
    }
    else{
        System.out.println("b is greater than a");
        if(b>c)
        {
            System.out.println("b is greater than c");
        }
        else{
            System.out.println("c is greater than b");
        }
    }
*/
//ternary operator
/*int a=7,b=10;
int max=(a>b)?a:b;
System.out.println("max is "+max);*/

//switch case
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int a=sc.nextInt();
switch(a)
{
    case 1:
    System.out.println("one");
    break;
    case 2:
    System.out.println("two");
    break;
    default:
    System.out.println("invalid number");
    break;
}
    System.out.println("hello Himanshu here");
    sc.close();
}
}

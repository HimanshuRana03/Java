package codes.Strings;
import java.util.*;
public class strings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name1= new String("Himanshu");
        String name2="Himanshu";
        System.out.println("name1 is "+name1);
        System.out.println("name2 is "+name2);
        /*if(name1==name2)//yaha pe both are not same print hoga kyuki reference compare hora hai na ki value agar string name1="himanshu" aur string name2
        //himanshu hota toh ye if condition ko print karta lekin upar name1 ye dusri string object hai aur name2 dusri
        {
            System.out.println("Both are same");
        }
        
        else{
            System.out.println("Both are not same");
        }*/
        //agar hume string ki value compare karna hai toh hume equals() method ka use karenge
        if(name1.equals(name2))
        {
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
/* 
        System.out.println("enter your first name");
        String firstname=sc.nextLine();
        System.out.println("enter your last name");
        String lastname=sc.nextLine();

        System.out.println("your firstname is "+firstname+" and your lastname is "+lastname);
*/
        String value="himanshu ";
        System.out.println(value.toLowerCase());
        System.out.println(value.toUpperCase());
        System.out.println(value.trim());
        System.out.println(value.startsWith("hi"));
        sc.close();
    }
}

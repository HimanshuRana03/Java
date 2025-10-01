import java.io.IOException;

public class exceptionhandling {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        //int a=20/0;
       /*  try{
            int a=10/0;
        }
        // catch(Exception e)
        // {
        //     System.out.println(e.getMessage());
        // }
        //ek aur tarika hai
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("exception encountered");
        }
        */

        // try catch and finally   try ke saath finally bhi karsakte hai
        try{
           // int a=10/0;/// by zero exception
            int a=10;//no exception
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        //finall ka ye seen hai ki exception ae ya  nae ye print hoga hi hoga
        finally{
            System.out.println("ye toh chakega hi chalega");
        }
        //There are some cases when a finally block does not execute:
        //Use of System.exit method
        //An exception occurs in the finally block 
        // The death of a thread

        //throw keyword is used to explicitly throw a single exception
        System.out.println("himanshu rana");

        //autoboxing:-The automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. For example - conversion of int to Integer, long to Long, double to Double, etc.
        //unboxing:-It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing. For example - conversion of Integer to int, Long to long, Double to double, etc.
        //Integer obj22= new Integer(12);
        //int a=obj22;//unboxing
        //System.out.println(a);
        //Integer obj2=22;//autoboxing

        //generics class
        //  class abs{
        //    // public static void main(String[] args) {
        //        dog<String> aobj =new dog<>("hello"); 
        //     }
        // }
        // class dog<E>{
        //     E name;
        //     void enter(E name)
        //     {
        //         this.name=name;
        //     }
        // }

    }  
    }


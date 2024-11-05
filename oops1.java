
public class oops1 {
    public static void main(String[] args) {
        
       /*Animal obj1= new Animal();
       obj1.name="Himanshu";
       obj1.walk();

       Animal obj2= new Animal();
       obj2.name="Rana";
       obj2.walk();
*/  Overloading obj1= new Overloading();
        System.out.println("the add is "+ obj1.add(10,20));
    }
}
//yaha pe kitni bhi classes bana sakte hai lekin public class sirf ek hi hogi jo ki main class hai
class Animal{
    String name;
    void walk()
    {
        System.out.println(name+" is walking");
    }
}
class Overloading{
    int add(int a,int b)
    {
        return a+b;
    }
    double add(int a,double b)
    {
        return a+b;
    }
}

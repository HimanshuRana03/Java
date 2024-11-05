 public class methodoverriding {
   //final int a=2;
   int a;
    methodoverriding()
    {
        System.out.println("parent constructor");
    }
    methodoverriding(int a)
    {
        this.a=a;
        System.out.println("parameterised constructor");
    }
    void display(){
        System.out.println("This is parent class");
    }
     final void finalfunction()
    {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        inheriting obj= new inheriting();
        obj.display();
       // obj.finalfunction();
    }
}
class inheriting extends methodoverriding{
    inheriting()
    {
        super(10);
        System.out.println("child constructor");
    }
void display()
{
    super.display();
    System.out.println("this is child class");
}
/*void finalfunction(){
    error throw karra hai
}*/
/*
 final variable:variable with final keyword cannot be assigned again
 final method: cannot be overriden
 final class: cannot be inherited  
 */
}

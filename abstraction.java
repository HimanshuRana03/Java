public class abstraction {
    public static void main(String[] args) {
       b obj =new b();
       obj.get();
       obj.id(20);

       dog obj2=new dog();
       obj2.dance();
    }
}
abstract class a{
    abstract void id(int idno);
    //contains both abstract as well as no abstract functions
    void get()
    {
        System.out.println("inside non abstarct function in parent class");
    }
}
class b extends a{
    void id(int idno)
    {
        System.out.println("inside id function with id"+idno);
    }
}
interface animal  {
void dance();//conatines only abstract function and by default all of them are abstract function 
//variables are static and final only here
}

class dog implements animal{
public void dance()
{
    System.out.println("dog is dancing");
}
}

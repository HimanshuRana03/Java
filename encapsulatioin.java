public class encapsulatioin {
    public static void main(String[] args) {
        b obj= new b();
        obj.get(12,12);
        obj.set();
        System.out.println("the value of staic count is "+a.val3);
    }
}
class a{
public int val1;
public int val2;//private int val2;
static int val3=10;//this value will be remained same for all the objects
public void get(int val1,int val2)
{
    this.val1=val1;
    this.val2=val2;
}
}
class b extends a{
public void set()
{
    System.out.println("the public val is "+val1);
    System.out.println("the private value is "+val2);
}
}
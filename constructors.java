public class constructors {
    public static void main(String[] args) {
        construct obj= new construct(20);
        obj.display();
    }
}
class construct{
    int a;
    /*default constructor
    public construct()
    {
        a=10;
    }*/
    public construct(int a)
    {
        this.a=a;
    }
    void display()
    {
        System.out.println(a);
    }
}


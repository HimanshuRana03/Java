 class inheritance {
public static void main(String[] args) {
    child obj= new child();
    obj.get(1,2);
    obj.show();
    obj.display();

}
}
class parent{
    int a, b;
    void get(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
void show()
{
    System.out.println("i am in parent class");
    
}
}
class child extends parent{
void display()
{
System.out.println("i am in child class");
System.out.println(a+b);
}
}

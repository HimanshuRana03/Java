public class object_class {
    public static void main(String[] args) {
        car obj = new car(2024,"Honda");
        System.out.println(obj);
        System.out.println(obj.toString());//same as above kyuki by default to string hi karte hai
    }
}
class car{
    int year;
    String model;
    car(int year,String model)
    {
        this.year=year;
        this.model=model;
    }
    public String toString()
    {
        return " hello this is car "+this.model+" and the year is "+this.year;
    }
}
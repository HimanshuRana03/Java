package codes.Numbers;

public class pallindrome_no {
    public static void main(String[] args) {
    int no=1646;
    String s=String.valueOf(no);
    int i=0,j=s.length()-1;
    boolean check=true;
    while(i<j)
    {
        if(s.charAt(i)==s.charAt(j))
        {
            i++;j--;
        }
        else {
            check=false;
            break;
        }
    } 
    if (check==false)
    {
        System.out.println("not");
    }   
    else {
        System.out.println("yes");
    }
    }
    
}

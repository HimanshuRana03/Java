package codes.Strings;

public class string_manipulation {
    public static void main(String[] args) {
        String str="Hello how are you";
        // System.out.println("The length of the string is "+str.length());
        // System.out.println(str.charAt(0));
        // System.out.println(str.indexOf('o'));
        // System.out.println(str.lastIndexOf('o'));
        // System.out.println(str.indexOf("how"));

        //string comparison
        // String str1="hello how are you";
        // System.out.println(str.equals(str1));
        // System.out.println(str.equalsIgnoreCase(str1));
        // System.out.println(str.substring(0,5));


        //trim
        // String name=" Himanshu ";
        // System.out.println(name.trim());


        //split
        String arr[]=str.split(" ");
        System.out.println("The length of the string arr is \n"+arr.length);
        String revword="";
        for(int i=arr.length-1;i>=0;i--)
        {
            revword+=arr[i]+" ";
        }
        System.out.print("the rev word is \n"+revword.trim());



    }
}

import java.util.Scanner;
public class Stringcount{
 static Scanner sc=new Scanner(System.in);
 public static void main(String args[])
 {
    System.out.println("Enter String");
    String str=sc.nextLine();
     
    int count=0;
    for(int i=0;i<str.length();i++)
    {
        count++;
    }
 
 System.out.println(count);
 }
    
}

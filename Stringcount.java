import java.util.Scanner;
public class Stringcount{
 static Scanner sc=new Scanner(System.in);
 public static void main(String args[])
 {
    System.out.println("Enter String");
    String str=sc.nextLine();
    
    int count=1;
    for(int i=0;i<str.length()-1;i++)
{
    if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
    {
        count++;
    }
}
System.out.println(count);
     
    
{




}
 }
    
}
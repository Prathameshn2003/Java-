import java.util.Scanner;
public class Stringcount{
 static Scanner sc=new Scanner(System.in);
 public static void main(String args[])
 {
    System.out.println("Enter String");
    String str=sc.nextLine();
     int vcount=0;
     int ccount=0;

     for(int j=0;j<str.length();j++)
{
    int ch=str.charAt(j);
     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
     {
        vcount++;
     }else{
        ccount++;
     }
}
System.out.println("Vowel count"+vcount);
System.out.println("cocanat count"+ccount);
 }
    

    
}
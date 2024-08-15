import java.util.Scanner;
public class factorial{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int fact=1;
        for(int i=o;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial is"+fact);
    
}}
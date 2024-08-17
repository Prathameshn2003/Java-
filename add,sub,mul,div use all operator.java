import java.util.Scanner;
public class factorial{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of b");
        int b=sc.nextInt();
        int c;
        System.out.println("choose operator");
        int ch=sc.next().charAt(0); 
        if(ch=='+')   {
            c=a+b;
            System.out.println("addtion is"+c);
        } else if(ch=='-'){
            c=a-b;
            System.out.println("sub is"+c);
        }else if(ch=='*'){
            c=a*b;
            System.out.println("mul is"+c);
        }else if(ch=='/'){
            c=a/b;
            System.out.println("div is"+c);
        }
        
    
}}

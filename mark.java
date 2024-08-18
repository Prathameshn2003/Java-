import java.util.Scanner;
public class mark{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("After swap a ");
        int a=sc.nextInt();
        System.out.println("After swap b ");
        int b=sc.nextInt();

       // int temp=a;
       // a=b;
       // b=temp;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Before swap a "+a);
        System.out.println("Before swap b "+b);

            
    }
}
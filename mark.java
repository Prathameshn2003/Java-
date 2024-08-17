import java.util.Scanner;
public class mark{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt(); 
        System.out.println("reverse number is");
        
        int reverse;
        while(num>0)
        {
            int rem=num%10;
             reverse=rem;
            
             num=num/10;
             System.out.print(+reverse);

        }
    }
}
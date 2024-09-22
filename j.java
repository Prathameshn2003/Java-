import java.util.Scanner;
public class j{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(); 
        while(num>0)
        {
            int rem=num%10;
            System.out.print(rem);


             num=num/10;
        }
    }
}
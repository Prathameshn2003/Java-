import java.util.Scanner;
public class EvenOdd{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int evennum=0;
        int oddnum=0;
        for(int i=0;i<=num;i++)
        {
            if(i%2==0)
            {
                evennum=evennum+i;
            }else{
                oddnum=oddnum+i;
            }
        }
        System.out.println("even number sum is"+evennum);
        System.out.println("odd number sum is"+oddnum);
    }
}

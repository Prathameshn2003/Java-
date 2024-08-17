import java.util.Scanner;
public class evenodd{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int  evensum=0;
        int oddsum=0;
        while(num>0)
        {
            int rem=num%10;
            if(rem%2==0)
            {
                evensum=evensum+rem;
            }else{
                oddsum=oddsum+rem;
            }
            
            num=num/10;
        }
        System.out.println("even number sum"+evensum);
        System.out.println("odd number sum "+oddsum);
    }
}

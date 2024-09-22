import java.util.Scanner;
public class arraycount{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt(); 
        int array[]=new int[size];
        int count=0;
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();

            while(array[i]>0)
            {
                int rem=array[i]%10;
                count++;
                 array[i]=array[i]/10;
            }

        }
        System.out.println("total array count"+count);


         
            
        
        
        
            

    
}}

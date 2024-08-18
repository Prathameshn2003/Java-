
import java.util.Scanner;
public class swap{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size");
    int size=sc.nextInt();
    int array[]=new int[size];
    int sum=0;
    for(int i=0;i<size;i++){
        System.out.println("Enter array element");
         array[i]=sc.nextInt();
         sum=sum+array[i];      

    }
    System.out.println("sum of array element"+sum);

    
  }
}
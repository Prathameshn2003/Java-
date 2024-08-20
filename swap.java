
import java.util.Scanner;
public class swap{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size");
    int size=sc.nextInt();
    int array[]=new int[size];
    int max=Integer.MIN_VALUE;//array[0];
    int min=Integer.MAX_VALUE;//array[0];
    for(int i=0;i<size;i++){
        System.out.println("Enter array element");
         array[i]=sc.nextInt();
         if(max<array[i]){
          max=array[i];

         }else if(min>array[i]){
          min=array[i];
         }

    }
    System.out.println("max element is "+max);
    System.out.println("min element is"+min);

    
  }
}
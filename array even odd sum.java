
import java.util.Scanner;
public class array{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size");
    int size=sc.nextInt();
    int array[]=new int[size];
    int evensum=0;
    int oddsum=0;
    for(int i=0;i<size;i++){
        System.out.println("Enter array element");
         array[i]=sc.nextInt();
        if(array[i]%2==0)
        {
          evensum=evensum+array[i];
        } else{
          oddsum=oddsum+array[i];
        }    

    }
    System.out.println("sum of even number "+evensum);
    System.out.println("sum of odd number"+oddsum);

    
  }
}

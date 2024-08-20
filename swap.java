import java.util.Scanner;
public class swap{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int array[]=new int[size];
    int count=0;
    for(int i=0;i<size;i++)
    {
      System.out.print("Enter array element");
      array[i]=sc.nextInt();
      while(array[i]>0){
        int rem=array[i]%10;
            count++;
            array[i]=array[i]/10;
      }
      
    }
    System.out.println("count of element"+count);
  }
}
import java.util.Scanner;
public class mark{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mark");
        int mark=sc.nextInt();
        if(mark>=90)
        {
            System.out.println("A Grade ");
        }else if(mark>=75)
        {
            System.out.println("B Grade");
            
        }else if(mark>=45)
        {
            System.out.println("C Grade");
        }else{
            System.out.println("F Grade");
        }
        }
        
    }
    

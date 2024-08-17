import java.util.Scanner;
public class mark
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        String Grade;
        if(mark>=90){
            Grade="A";
        }else if(mark>=75){
            Grade="B";
        }else if(mark>=45){
            Grade="c";
        }else{
            Grade="F";
        }
        System.out.println("Grade is"+Grade);
    }
}

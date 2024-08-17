import java.util.Scanner;
public class table{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("table of "+num+" is");

        int table;
        for(int i=1;i<=10;i++){
            table=num*i;
            System.out.println(+table);
        }
        
    
}}

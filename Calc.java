
package calc;
import java.util.Scanner;
 
public class Calc {
    
     void sum(int a,int b)
    {
        System.out.println("sum is:"+(a+b));
    }
    void sum(double a,double b)
    {
        System.out.println("Sum is:"+(a+b));
    }

    
    public static void main(String[] args) 
    {
        int a,b;
        double c,d;
        Scanner sc=new Scanner(System.in);
  
    
    System.out.println("Enter the 2 integer numbers:");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("enter 2 decimal numbers:");
    c=sc.nextDouble();
    d=sc.nextDouble();
    
    Calc c1=new Calc();
                c1.sum(a,b);
                c1.sum(c,d);
}
}
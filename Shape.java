
package shape;
import java.util.Scanner;

public class Shape
{
     float side,length,breadth;
     double radius;
    public void area(float s)
    {
        s=side*side;
        System.out.println("Area of square :"+s);
    }
    public void area(float l,float b)
    {
        float a;
        length=l;
        breadth=b;
        a=length * breadth;
        System.out.println("Area of rectangle :"+a);    
        
    }
      public void area(double r)
    {
        double area;
        radius=r;
        area=2*Math.PI*radius;
        System.out.println("Area of circle :"+Math.round(area));
    }
        
        
    public static void main(String[] args) 
    {
        float l,b,s;
        double r;
        
        Scanner sc=new Scanner(System.in);
        Shape s1=new Shape();
        
        System.out.println("enter the side of square");
        s=sc.nextFloat();
        
         System.out.println("enter the length and breadth of rectangle");
         l=sc.nextFloat();
         b=sc.nextFloat();
         
        System.out.println("enter the radius of circle");
        r=sc.nextDouble();
        
        s1.area(s);
        s1.area(l,b);
        s1.area(r);
    }
    
}

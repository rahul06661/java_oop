
import java.util.Scanner;
class ComplexNumbers
{
    int real;
    int img;
    ComplexNumbers(int r,int i)
    {
        real=r;
        img=i;
    }
    public void display()
    {
        System.out.println(real+"+i"+img);
    }
    public  static ComplexNumbers add(ComplexNumbers n1,ComplexNumbers n2)
    {
        ComplexNumbers r3=new ComplexNumbers(0,0);
        r3.real=n1.real+n2.real;
        r3.img=n1.img+n2.img;
        return r3;
    }
            
    public static void main(String args[])
    {
        int r1,i1,r2,i2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real and imaginary part");
        r1=sc.nextInt();
        i1=sc.nextInt();
        ComplexNumbers n1=new ComplexNumbers(r1,i1);
        n1.display();
        System.out.println("Enter the real and imaginary part");
        r2=sc.nextInt();
        i2=sc.nextInt();
        ComplexNumbers n2=new ComplexNumbers(r2,i2);
        n2.display();
        System.out.println("Sum of the numbers=");
        ComplexNumbers r3=add(n1,n2);
        r3.display();
    }
}

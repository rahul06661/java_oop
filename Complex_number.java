package complex_number;

import java.util.Scanner;
public class Complex_number{
    int real,img;
    
    Complex_number()
    {
        
    }

    Complex_number(int realn,int imgn){
        real=realn;
        img=imgn;
        
        
    }
    
    public Complex_number add(Complex_number c1,Complex_number c2){
        Complex_number c=new Complex_number();
        c.real=c1.real+c2.real;
        c.img=c1.img+c2.img;
        return c;
    }
    
    public static void main(String[] args) {
        int real1,img1,real2,img2;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter first number real part");
        real1=sc.nextInt();
        System.out.println("Enter the first number imaginary part");
        img1=sc.nextInt();
        System.out.println("Enter second number real part");
        real2=sc.nextInt();
        System.out.println("Enter the second number imaginary part");
        img2=sc.nextInt();
        
        Complex_number c1=new Complex_number(real1,img1);
        Complex_number c2=new Complex_number(real2,img2);
        Complex_number c3=new Complex_number();
        
        c3=c3.add(c1,c2);
        
        System.out.println("\ncomplex no 1:"+real1+"+i"+img1);
        System.out.println("\ncomplex no 2:"+real2+"+i"+img2);
        
        System.out.println("\nThe sum of numbers = "+c3.real+"+i"+c3.img);
        
        
        
    }
    
}



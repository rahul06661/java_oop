package javaapplication1;

import java.util.Scanner;

class Product
{
     int pcode;
     String pname;
     float price;
     Scanner sc=new Scanner(System.in);
    public void read()
    {      
        System.out.println("\n enter pcode ");       
        pcode=sc.nextInt();        
        System.out.println("\n enter  pname ");
        pname=sc.next();     
        System.out.println("\n enter price");
        price=sc.nextFloat();              
        
    }
}


public class JavaApplication1 {
    public static void main(String[] args) {
      Product p1=new Product();
      p1.read();
      Product p2=new Product();
      p2.read();
      if(p1.price>p2.price)
      {
          System.out.println("p1 has higher price");
      }
      else
      {
          System.out.println("p2 has higher price");
      }
       
    }
    
}


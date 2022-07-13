/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author sjcet
 */
public class Product {
int pcode;
int price;
String name;
Product(int a,int b,String c)
{
    pcode=a;
    price=b;
    name=c;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Product p1=new Product(101,500,"Toblerone");
       Product p2=new Product(102,1000,"foundation");
       Product p3=new Product(103,2000,"bag"); // TODO code application logic here
    if (p1.price < p2.price)
    {
        System.out.println("price of toblerone is lowest");
    }
    else if (p2.price<p3.price)
    {
        System.out.println("price of foundation is lowest");
    }
    else
    {
        System.out.println("price of bag is lowest");
    }
    }
}

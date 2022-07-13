/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author sjcet
 */
public class Employee {
    float m1,m2,m3;
    float p;
    Employee(int a,int b,int c)
    {
        m1=a;
        m2=b;
        m3=c;
    }
    public void sum()
    {
        System.out.println("sum is="+(m1+m2+m3));
        
    }
    public void percentage()
    {
        p=( ( (m1+m2+m3) / 300) * 100);
  
System.out.println("percentage is="+p);
}
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
{
Employee e1=new Employee(10,20,30);
Employee e2=new Employee(40,50,60);
e1.sum();
e1.percentage();
e2.sum();
e2.percentage();
        // TODO code application logic here
    }
    
}

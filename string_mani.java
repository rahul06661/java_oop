/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author sjcet
 */

class Stri
{
    
    
    public void compare(String str1,String str2)
        {
            if(str1.compareTo(str2)==0)

            {
                System.out.println("Strings are equal");
            }
            else
            {
                System.out.println("Strings are not equal");
            }   
        }
    
    public void concat(String str1,String str2)
    {
        System.out.println("String  after concat "+str1+str2);
    }
    
    public void char_pos(String str1, int a)
    {
        System.out.println(str1.charAt(a));
    }
}



public class JavaApplication9 {
    


    public static void main(String[] args) {
        
      String str1,str2;
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter strings");
      str2=sc.next();
      str1=sc.next();
      Stri s=new Stri();
      s.compare(str2,str1);
      s.concat(str1, str2);
      System.out.println("Enter number");
      num=sc.nextInt();     
      s.char_pos(str1, num);
      
      
      
      
      
     
    }
}

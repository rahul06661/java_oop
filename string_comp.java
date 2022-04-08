/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_comp;

import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class string_comp {


    public static void main(String[] args) {
        
      int size;
      String str[]=new String[10];
      String temp;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no.of Strings");
      size=sc.nextInt();
      for(int i=0;i<size;i++)
      {
          str[i]=sc.next();
      }
      
      for(int i=0;i<size;i++)
      {
          for(int j=0;j<size;j++)
          {
          if(str[j].compareTo(str[i])>0)
          {
              temp=str[i];
              str[i]=str[j];
              str[j]=temp;
          }
          
           }
      }
        System.out.println("_________________");
       for(int i=0;i<size;i++)
       {
           System.out.println(str[i]);
       }
      
     
      
      
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsort;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class StringSort 
{
     int n;
     String temp;
     String a[]=new String[10];
     
     
     Scanner sc=new Scanner(System.in);
    StringSort(int size){
        n=size;
        
        
    }
    
    public void read(){
        
        System.out.println("Enter the strings:");
        for(int i=0;i<n;i++){
          a[i]=sc.nextLine();
            
        }
    }
    
    public void sort(){
        
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].compareTo(a[j])>0){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            
        }
        
        System.out.println("\n Sorted Strings:");
        for(int i=0;i<n;i++){
            System.out.println("\n"+a[i]);
        }
        
    }
    
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of strings");
        n=sc.nextInt();
        
        
        
        StringSort s1=new StringSort(n);
        s1.read();
        s1.sort();
    }
    
}

package javaapplication1;

import java.util.Scanner;



public class JavaApplication1 {
    public static void main(String[] args) {
        int m,n;
        int m1[][]=new int[10][10];
        int m2[][]=new int[10][10];
        System.out.print("Enter m and n");
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("Enter mat1");
        
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                m1[i][j]=sc.nextInt();
            }
        }
         System.out.println("Enter mat2");
        
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                m2[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("\n sum is:");
       for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("\t");
                System.out.print(m1[i][j]+m2[i][j]);
            }
            System.out.println("");
        }
        
      
    
}
}


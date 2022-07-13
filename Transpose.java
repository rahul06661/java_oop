/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transpose;
import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class Transpose
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        int m,n,i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the rows and coloums of matrix:");
    m=sc.nextInt();
    n=sc.nextInt();
    int M[][]=new int[m][n];
    System.out.println("enter the elements of matrix:");
    for(i=0 ;i<m; i++)
    {
        for(j=0; j<n; j++)
        {
            M[i][j]=sc.nextInt();
            
        }
    }
    System.out.println("The Matrix is:");
    for(i=0;i<m;i++)

  {

    for(j=0;j<n;j++)

    {

     System.out.print("\t"+M[i][j]);
    }
     System.out.print("\n");

  }
    System.out.println("The Transposed Matrix is:");

        for(i=0;i<m;i++)

      {

      for(j=0;j<n;j++)

      {

          System.out.print("\t"+M[j][i]);

      }
      System.out.println("\n");
      }
    }

}
    
       
    
    


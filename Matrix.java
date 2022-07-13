package matrix;

import java.util.Scanner;
public class Matrix
{
    public static void main(String[] args)
    {
    int p,q,m,n,i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the rows and coloums of 1st matrix:");
    m=sc.nextInt();
    n=sc.nextInt();
    int M1[][]=new int[m][n];
    int Sum[][]=new int[m][n];
    System.out.println("enter the elements of 1st matrix:");
    for(i=0 ;i<m; i++)
    {
        for(j=0; j<n; j++)
        {
            M1[i][j]=sc.nextInt();
            }
    }
    System.out.println("enter the rows and coloums of 2nd matrix:");
    p=sc.nextInt();
    q=sc.nextInt();
    int M2[][]=new int[p][q];
    System.out.println("enter the elements of 2nd matrix:");
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            M2[i][j]=sc.nextInt();
            
        }
    }
    if(m==p)
    {
        for(i=0; i<m; i++)
        {
            for(j=0; j<n; j++)
            {
               Sum[i][j]=M1[i][j]+M2[i][j];
    }
        }
        System.out.println("the sum of matrices are:");
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                System.out.print("\t"+Sum[i][j]);
            }
            System.out.println();
        }
            
            
            }
    else
    {
        System.out.println("Matrix Addition is not possible");
    }
       
}
}
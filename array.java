import java.util.Scanner;

class  array{
    public static void main(String args[])
    {
        int[] arrays=new int[10];
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        size=sc.nextInt();
        System.out.println("enter array elements");
        for(int i=0;i<size;i++)
        {
            arrays[i]=sc.nextInt();
        }
        System.out.println("elemens :");

        for (int i=0;i<arrays.length;i++)
        { 
            
            System.out.println(arrays[i]);
        }


    }
}

 
package totalsalary;

public class Totalsalary
{
    int id,salary;
    String name;
    Totalsalary()
    {
     id=101;
salary=10000;
      name="Tessa Robin";
    }
     public void tsalary()
     {
         int total_salary=0;
        total_salary= salary+(salary*20)/100;
        System.out.println(total_salary);
        
         System.out.println("Total salary is="+(salary+salary*(20/100)));
         
     }
     public static void main(String[] args)
     {
     Totalsalary t=new Totalsalary();
             t.tsalary();
}
}
    
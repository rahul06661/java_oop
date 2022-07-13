package employee;


import java.util.Scanner;


public class EMPLOYEE{

int EmpId;

String Name;

double BasicSalary,TSalary;

void getdata()

{

Scanner sc=new Scanner(System.in);


System.out.println("Enter Id ");

EmpId=sc.nextInt();

System.out.println("Enter Name");

Name=sc.next();

System.out.println("Enter Salary");

BasicSalary=sc.nextDouble();

}

public void getSalary()

{

    double HRA,DA;

    if(BasicSalary<=10000)

    {

        HRA=(BasicSalary*8)/100;

        DA=(BasicSalary*10)/100;

        TSalary=BasicSalary+HRA+DA;

}

    else if(BasicSalary<=20000)

    {

        HRA=(BasicSalary*16)/100;

        DA=(BasicSalary*20)/100;

        TSalary=BasicSalary+HRA+DA;

}

    else

    {

        HRA=(BasicSalary*24)/100;

        DA=(BasicSalary*30)/100;

        TSalary=BasicSalary+HRA+DA;

}

}


void display()

{

System.out.println("Employee Id is : "+ EmpId);

System.out.println("Employee Name is : "+ Name);

System.out.println("Employee Salary is : "+ BasicSalary);

  System.out.println("Employee's Total Salary:"+TSalary);

}


public static void main(String[] args) {

Scanner sc1=new Scanner(System.in);

int i,n,f=0,id;

double low;

System.out.println("Enter the number of Employees");

n=sc1.nextInt();

EMPLOYEE e[]=new EMPLOYEE[n];

for(i=0;i<n;i++)

{

e[i]=new EMPLOYEE();

e[i].getdata();

e[i].getSalary();

}

low=e[0].TSalary;

id=e[0].EmpId;

for(i=1;i<n;i++)

{

    if(low>e[i].TSalary)

    {

        low=e[i].TSalary;

        id=e[i].EmpId;

    }

}

System.out.println("Employee details are :\n");

for(i=0;i<n;i++) {

e[i].display();

System.out.println("\n");

}


for(i=0;i<n;i++) {

if(id==e[i].EmpId) {

f=1;

break;

}

}

if(f==1) {

System.out.println("Employee With Lowest Salary:\n");

e[i].display();

}

else

System.out.println("Employee Not Found!!!");	


}

}
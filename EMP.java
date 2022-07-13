package emp;

import java.util.Scanner;
public class EMP {
    int empid;
    double esalary;
    String ename;
    double hra,da;
    
    EMP(int id,String name,double salary){
        empid=id;
        ename=name;
        esalary=salary;
                
        
        
    }
    
    public void getSalary(){
        
        if(esalary<=10000){
            hra= (esalary * 8 / 100);
            da= ( esalary * 10 / 100);
            esalary=esalary+hra+da;
            System.out.println("alert");
        }
        
        else if(esalary<=20000){
            hra=(esalary * 16 / 100);
            da=(esalary * 20 / 100);
            esalary=esalary+hra+da;
            
        }
        else if(esalary>20000){
            
            hra=(esalary * 24 / 100);
            da=(esalary * 30 / 100);
            esalary=esalary+hra+da;
            
        }
        
        
    }
    
    public void display(){
        System.out.println("employee details");
        System.out.println("emp id :"+empid);
        System.out.println("Name :"+ename);
        System.out.println("salary:"+esalary);
        
    }
    

    
    public static void main(String[] args) {
        int empid,n;
        double salary,low;
        
        String ename,lname;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter nof of employess");
        n=sc.nextInt();
       
        
        EMP e[]=new EMP[n];
        
        
        
        for(int i=0;i<n;i++){
          System.out.println("\n enter employee details:"+(i+1));
          System.out.println("enter employee id,name &salary");
          empid=sc.nextInt();
          ename=sc.next();
          salary=sc.nextDouble();
          
          e[i]=new EMP(empid,ename,salary);
          e[i].getSalary();
           }
        
        for(int i=0;i<n;i++){
          System.out.println("\n employee details:"+(i+1));
          e[i].display();
        }
        
        low=e[0].esalary;
        lname=e[0].ename;
        
        for(int i=1;i<n;i++){
            if(e[i].esalary<low){
                low=e[i].esalary;
                lname=e[i].ename;
                
            }
        }
        
        System.out.println("Employee :"+lname+"  having low salary :"+low);
            
        
        
        
        
    }
    
}
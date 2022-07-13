package inheritance;


public class Animal1 
{
    void eat()
    {
        System.out.println("eating...");
        
    }
    public class Dog extends Animal
    {
        System.out.println("Barking...");
        }
    }
    
public class Inheritance 
{
   public static void main(String[] args) 
   {
       Dog d=new Dog();  
d.bark();  
 d.eat();
    }
}


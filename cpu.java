
//Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)
//and static nested class RAM (memory, manufacturer). Create an object of CPU and print
//information of Processor and RAM
        
public class cpu {
    int price=90;
    cpu()
    {
        System.out.println("price "+price);
    }

    class Processor
    {
        int no_of_cores=5;
        String manufacturer="intel_hello";
        Processor()
        {
            System.out.println("cores "+no_of_cores);
            System.out.println("cores manufacturer "+manufacturer);

        }
    }

    static class RAM{
        int memory=4;
        String manufacturer="samsung";
        RAM()
        {
            System.out.println("RAM memory "+memory);
            System.out.println("RAM manufacturer "+manufacturer);


        }
    }
    public static void main(String args[])
    {
        cpu c=new cpu();
        cpu.Processor m= c.new Processor();
        cpu.RAM R= new cpu.RAM();

    }
    
}

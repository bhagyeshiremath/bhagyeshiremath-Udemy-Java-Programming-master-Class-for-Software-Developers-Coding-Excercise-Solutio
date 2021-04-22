public class Holden extends Car 
{
    public Holden(String name, int cylinders) 
    {
        super(name, cylinders);
    }

    @Override
    public void startEngine() 
    {
        System.out.println("Holden.startEngine() called.");
    }
    
    @Override
    public void accelerate() 
    {
        System.out.println("Holden.accelerate() called.");
    }
    
    @Override
    public void brake() 
    {
        System.out.println("Holden.brake() called.");
    }
}

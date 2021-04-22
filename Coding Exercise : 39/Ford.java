public class Ford extends Car 
{
    public Ford(String name, int cylinders) 
    {
        super(name, cylinders);
    }

    @Override
    public void startEngine() 
    {
        System.out.println("Ford.startEngine() called.");
    }
    
    @Override
    public void accelerate() 
    {
        System.out.println("Ford.accelerate() called.");
    }
    
    @Override
    public void brake() 
    {
        System.out.println("Ford.brake() called.");
    }
}

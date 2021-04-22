public Mitsubishi extends Car
{
    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
        this.wing = true;
    }

    @Override
    public void startEngine() 
    {
        System.out.println("Mitsubishi.startEngine() called");
    }
    
     public void accelerate() 
    {
        System.out.println("Mitsubishi.accelerate() called");
    }
    
     public void brake() 
    {
        System.out.println("Mitsubishi.brake() called");
    }
}

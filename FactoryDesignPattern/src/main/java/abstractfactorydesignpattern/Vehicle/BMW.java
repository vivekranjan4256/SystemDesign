package abstractfactorydesignpattern.Vehicle;

public class BMW implements Vehicle{
    @Override
    public void createObject() {
        System.out.println("Luxury Vehicle BMW.");
    }
}

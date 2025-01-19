package abstractfactorydesignpattern.Vehicle;

public class Hyundai implements Vehicle{
    @Override
    public void createObject() {
        System.out.println("Ordinary Vehicle Hyundai.");
    }
}

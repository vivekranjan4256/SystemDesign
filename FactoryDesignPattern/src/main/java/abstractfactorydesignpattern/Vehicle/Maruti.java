package abstractfactorydesignpattern.Vehicle;

public class Maruti implements Vehicle {
    @Override
    public void createObject() {
        System.out.println("Ordinary Vehicle Maruti.");
    }
}

package abstractfactorydesignpattern;

import abstractfactorydesignpattern.TopLevelFactory.TopLevelFactoryImpl;
import abstractfactorydesignpattern.Vehicle.Vehicle;
import abstractfactorydesignpattern.VehicleFactory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        TopLevelFactoryImpl topLevelFactory = new TopLevelFactoryImpl();
        VehicleFactory luxuryVehicleFactory = topLevelFactory.createVehicleFactory("Luxury");
        VehicleFactory ordinaryVehicleFactory = topLevelFactory.createVehicleFactory("Ordinary");

        Vehicle luxuryVehicle1 = luxuryVehicleFactory.getVehicle("BMW");
        luxuryVehicle1.createObject();
        Vehicle luxuryVehicle2 = luxuryVehicleFactory.getVehicle("Mercedes");
        luxuryVehicle2.createObject();

        Vehicle ordinaryVehicle1 = ordinaryVehicleFactory.getVehicle("Maruti");
        ordinaryVehicle1.createObject();
        Vehicle ordinaryVehicle2 = ordinaryVehicleFactory.getVehicle("Hyundai");
        ordinaryVehicle2.createObject();
    }
}

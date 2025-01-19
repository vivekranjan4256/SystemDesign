package abstractfactorydesignpattern.VehicleFactory;

import abstractfactorydesignpattern.Vehicle.BMW;
import abstractfactorydesignpattern.Vehicle.Mercedes;
import abstractfactorydesignpattern.Vehicle.Vehicle;

public class LuxuryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String input) {
        return switch (input){
            case "Mercedes" -> new Mercedes();
            case "BMW" -> new BMW();
            default -> null;
        };
    }
}

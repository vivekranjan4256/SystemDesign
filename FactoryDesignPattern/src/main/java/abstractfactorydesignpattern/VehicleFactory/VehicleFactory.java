package abstractfactorydesignpattern.VehicleFactory;

import abstractfactorydesignpattern.Vehicle.Vehicle;

public interface VehicleFactory {
    Vehicle getVehicle(String input);
}

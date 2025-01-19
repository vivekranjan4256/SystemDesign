package abstractfactorydesignpattern.TopLevelFactory;

import abstractfactorydesignpattern.VehicleFactory.VehicleFactory;

public interface TopLevelFactory {
    VehicleFactory createVehicleFactory(String type);
}

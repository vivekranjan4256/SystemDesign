package abstractfactorydesignpattern.TopLevelFactory;

import abstractfactorydesignpattern.VehicleFactory.LuxuryVehicleFactory;
import abstractfactorydesignpattern.VehicleFactory.OrdinaryVehicleFactory;
import abstractfactorydesignpattern.VehicleFactory.VehicleFactory;

import java.util.Objects;

public class TopLevelFactoryImpl implements TopLevelFactory{
    @Override
    public VehicleFactory createVehicleFactory(String type) {
        if(Objects.equals(type, "Luxury")) {
            return new LuxuryVehicleFactory();
        }
        else if(Objects.equals(type, "Ordinary")) {
            return new OrdinaryVehicleFactory();
        }
        return null;
    }
}

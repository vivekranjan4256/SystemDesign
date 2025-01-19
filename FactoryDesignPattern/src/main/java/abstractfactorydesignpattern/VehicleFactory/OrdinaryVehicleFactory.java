package abstractfactorydesignpattern.VehicleFactory;

import abstractfactorydesignpattern.Vehicle.Hyundai;
import abstractfactorydesignpattern.Vehicle.Maruti;
import abstractfactorydesignpattern.Vehicle.Vehicle;

public class OrdinaryVehicleFactory implements VehicleFactory{

    @Override
    public Vehicle getVehicle(String input) {
        switch (input){
            case "Maruti":
                return new Maruti();
            case "Hyundai":
                return new Hyundai();
            default:
                return null;
        }
    }
}

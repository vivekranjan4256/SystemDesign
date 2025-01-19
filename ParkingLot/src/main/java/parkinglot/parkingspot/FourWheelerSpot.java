package parkinglot.parkingspot;

import parkinglot.vehicle.Vehicle;

public class FourWheelerSpot extends ParkingSpot{
    public FourWheelerSpot(int id, boolean isEmpty, Vehicle vehicle){
        super(id, isEmpty, vehicle);
        this.price=15;
    }
}

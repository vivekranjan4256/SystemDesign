package parkinglot.parkingspot;

import parkinglot.vehicle.Vehicle;

public class TwoWheelerSpot extends ParkingSpot{
    public TwoWheelerSpot(int id, boolean isEmpty, Vehicle vehicle){
        super(id, isEmpty, vehicle);
        this.price=10;
    }
}

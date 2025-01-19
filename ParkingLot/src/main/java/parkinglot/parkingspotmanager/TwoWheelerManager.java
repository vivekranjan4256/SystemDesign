package parkinglot.parkingspotmanager;

import parkinglot.parkingspot.ParkingSpot;
import parkinglot.parkingspot.TwoWheelerSpot;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerManager extends ParkingSpotManager{
    public TwoWheelerManager() {
        super(new ArrayList<TwoWheelerSpot>());
    }
}

package parkinglot.parkingspotmanager;

import parkinglot.parkingspot.FourWheelerSpot;
import parkinglot.parkingspot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerManager extends ParkingSpotManager{
    public FourWheelerManager() {
        super(new ArrayList<FourWheelerSpot>());
    }
}

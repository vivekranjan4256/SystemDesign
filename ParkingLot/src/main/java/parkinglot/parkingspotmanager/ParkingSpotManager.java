package parkinglot.parkingspotmanager;

import parkinglot.parkingspot.ParkingSpot;

import java.util.List;

public abstract class ParkingSpotManager {
    List<? extends ParkingSpot> parkingSpotList;
    public ParkingSpotManager(List<? extends ParkingSpot> parkingSpotList){
        this.parkingSpotList = parkingSpotList;
    }
    public void findParkingSpace(){};
    public void addParkingSpace(){};
    public void removeParkingSpace(){};
    public void parkVehicle(){};
    public void removeVehicle(){};
}

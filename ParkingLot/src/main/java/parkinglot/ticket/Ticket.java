package parkinglot.ticket;

import parkinglot.parkingspot.ParkingSpot;
import parkinglot.vehicle.Vehicle;

public class Ticket {
    long entryTime;
    Vehicle vehicle;
    ParkingSpot spot;

    public Ticket(long entryTime, Vehicle vehicle, ParkingSpot spot){
        this.entryTime=entryTime;
        this.vehicle=vehicle;
        this.spot=spot;
    }

    public long getEntryTime(){
        return entryTime;
    }
    public void setEntryTime(long entryTime){
        this.entryTime=entryTime;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
    }

    public ParkingSpot getSpot() {
        return spot;
    }
    public void setParkingSpot(ParkingSpot spot){
        this.spot=spot;
    }
}

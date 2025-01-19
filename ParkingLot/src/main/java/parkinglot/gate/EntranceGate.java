package parkinglot.gate;

import parkinglot.parkingspot.ParkingSpot;
import parkinglot.parkingspotmanager.ParkingSpotManager;
import parkinglot.parkingspotmanager.ParkingSpotManagerFactory;
import parkinglot.ticket.Ticket;
import parkinglot.vehicle.Vehicle;
import parkinglot.vehicle.VehicleType;

public class EntranceGate {
    ParkingSpotManagerFactory parkingSpotManagerFactory;
    ParkingSpotManager parkingSpotManager;
    Ticket ticket;

    public EntranceGate(ParkingSpotManagerFactory parkingSpotManagerFactory, ParkingSpotManager parkingSpotManager, Ticket ticket){
        this.parkingSpotManagerFactory=parkingSpotManagerFactory;
        this.parkingSpotManager=parkingSpotManager;
        this.ticket=ticket;
    }

    public void findParkingSpace(VehicleType vehicleType, int gateNo){};
    public void bookSpot(Vehicle vehicle){};
    public void generateTicket(Vehicle vehicle, ParkingSpot parkingSpot){};
}

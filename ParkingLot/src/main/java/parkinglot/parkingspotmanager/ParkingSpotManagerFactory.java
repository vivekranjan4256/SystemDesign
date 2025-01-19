package parkinglot.parkingspotmanager;

import parkinglot.ticket.Ticket;
import parkinglot.vehicle.VehicleType;

public class ParkingSpotManagerFactory {
    Ticket ticket;
    public ParkingSpotManagerFactory(Ticket ticket){
        this.ticket=ticket;
    }
    ParkingSpotManager getParkingSpotManager(){
        if(ticket.getVehicle().getVehicleType().equals(VehicleType.TWOWHEELER))
            return new TwoWheelerManager();
        else if(ticket.getVehicle().getVehicleType().equals(VehicleType.FOURWHEELER))
            return new FourWheelerManager();
    }
}

package parkinglot;

import parkinglot.parkingspot.ParkingSpot;
import parkinglot.parkingspot.TwoWheelerSpot;
import parkinglot.ticket.Ticket;
import parkinglot.vehicle.Vehicle;
import parkinglot.vehicle.VehicleType;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Vehicle vehicle = new Vehicle(1234, VehicleType.FOURWHEELER);
        ParkingSpot parkingSpot = new TwoWheelerSpot(1, true, vehicle);
        Ticket ticket = new Ticket(02122024, vehicle, parkingSpot);
        parkingSpot.parkVehicle(vehicle);
    }
}

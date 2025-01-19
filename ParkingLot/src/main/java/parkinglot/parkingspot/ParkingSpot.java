package parkinglot.parkingspot;

import parkinglot.vehicle.Vehicle;

public abstract class ParkingSpot {
    int id;
    boolean isEmpty;
    Vehicle vehicle;
    int price;

    public ParkingSpot(int id, boolean isEmpty, Vehicle vehicle){
        this.id=id;
        this.isEmpty=isEmpty;
        this.vehicle=vehicle;
    }
    public void parkVehicle(Vehicle vehicle){};
    public void removeVehicle(){};

    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public boolean getIsEmpty(){
        return isEmpty;
    }
    public void setEmpty(boolean isEmpty){
        this.isEmpty=isEmpty;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
}

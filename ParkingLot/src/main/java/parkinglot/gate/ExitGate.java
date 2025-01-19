package parkinglot.gate;

import parkinglot.costcomputation.CostComputation;
import parkinglot.costcomputation.CostComputationFactory;
import parkinglot.parkingspotmanager.ParkingSpotManager;
import parkinglot.parkingspotmanager.ParkingSpotManagerFactory;
import parkinglot.payment.Payment;
import parkinglot.ticket.Ticket;

public class ExitGate {
    Ticket ticket;
    ParkingSpotManagerFactory parkingSpotManagerFactory;
    ParkingSpotManager parkingSpotManager;
    CostComputationFactory costComputationFactory;
    CostComputation costComputation;
    Payment payment;

    public ExitGate(Ticket ticket, ParkingSpotManagerFactory parkingSpotManagerFactory, ParkingSpotManager parkingSpotManager, CostComputationFactory costComputationFactory, CostComputation costComputation, Payment payment){
        this.parkingSpotManagerFactory=parkingSpotManagerFactory;
        this.parkingSpotManager=parkingSpotManager;
        this.costComputationFactory=costComputationFactory;
        this.costComputation=costComputation;
        this.payment=payment;
    }

    public void priceCalc(){};
}

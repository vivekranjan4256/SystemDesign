package parkinglot.costcomputation;

import parkinglot.ticket.Ticket;
import parkinglot.vehicle.VehicleType;

public class CostComputationFactory {
    Ticket ticket;
    public CostComputationFactory(Ticket ticket){
        this.ticket=ticket;
    }
    CostComputation getCostComputation(){
        if(ticket.getVehicle().getVehicleType().equals(VehicleType.TWOWHEELER))
            return new TwoWheelerCostComputation(new HourlyPricingStrategy(ticket));
        else if (ticket.getVehicle().getVehicleType().equals(VehicleType.FOURWHEELER))
            return new FourWheelerCostComputation(new MinutePricingStrategy(ticket));
        return null;
    }
}

package parkinglot.costcomputation;

import parkinglot.ticket.Ticket;

public abstract class CostComputation {
    PricingStrategy pricingStrategy;
    public CostComputation(PricingStrategy pricingStrategy){
        this.pricingStrategy=pricingStrategy;
    }
    public long calculateCost(Ticket ticket){
        return pricingStrategy.calcPrice(ticket);
    }
}

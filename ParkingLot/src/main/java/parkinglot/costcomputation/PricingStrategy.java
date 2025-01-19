package parkinglot.costcomputation;

import parkinglot.ticket.Ticket;

public abstract class PricingStrategy {
    Ticket ticket;
    long price;
    public PricingStrategy(Ticket ticket){
        this.ticket=ticket;
    }
    public long calcPrice(Ticket ticket){return 0;};
}

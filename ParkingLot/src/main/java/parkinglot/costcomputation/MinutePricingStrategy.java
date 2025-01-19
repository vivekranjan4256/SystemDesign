package parkinglot.costcomputation;

import parkinglot.ticket.Ticket;

public class MinutePricingStrategy extends PricingStrategy{
    public MinutePricingStrategy(Ticket ticket){
        super(ticket);
    }

    public long calcPrice(Ticket ticket){
        return (ticket.getEntryTime()-1)*5;
    }
}

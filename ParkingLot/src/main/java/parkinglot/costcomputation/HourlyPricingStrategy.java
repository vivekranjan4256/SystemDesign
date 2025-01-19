package parkinglot.costcomputation;

import parkinglot.ticket.Ticket;

public class HourlyPricingStrategy extends PricingStrategy{

    public HourlyPricingStrategy(Ticket ticket) {
        super(ticket);
    }
    public long calcPrice(Ticket ticket){
        return (ticket.getEntryTime()-1)*50;
    }
}

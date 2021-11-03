package ua.lviv.iot.model.dao.implementation;

import ua.lviv.iot.model.dao.AbstractDAOImpl;
import ua.lviv.iot.model.entity.Ticket;

public class TicketDAOImpl extends AbstractDAOImpl<Ticket, Integer> {
    public TicketDAOImpl(){
        super(Ticket.class);
    }
}

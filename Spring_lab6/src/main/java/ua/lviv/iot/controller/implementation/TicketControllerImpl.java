package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.controller.AbstractControllerImpl;
import ua.lviv.iot.model.dao.implementation.TicketDAOImpl;
import ua.lviv.iot.domain.Ticket;

public class TicketControllerImpl extends AbstractControllerImpl<Ticket> {
    public TicketControllerImpl(){
        super(new TicketDAOImpl());
    }
}

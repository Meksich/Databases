package ua.lviv.iot.mapper.implementation;

import org.springframework.stereotype.Component;
import ua.lviv.iot.DTO.TicketDTO;
import ua.lviv.iot.domain.Ticket;
import ua.lviv.iot.mapper.AbstractMapper;

@Component
public class TicketMapper implements AbstractMapper<Ticket, TicketDTO> {
    @Override
    public TicketDTO map(Ticket ticket) {
        TicketDTO.TicketDTOBuilder ticketDTOBuilder = TicketDTO.builder();
        ticketDTOBuilder.id(ticket.getId());
        ticketDTOBuilder.height(ticket.getHeight());
        ticketDTOBuilder.width(ticket.getWidth());
        ticketDTOBuilder.price(ticket.getPrice());
        ticketDTOBuilder.producedNumber(ticket.getProducedNumber());
        return ticketDTOBuilder.build();
    }
}

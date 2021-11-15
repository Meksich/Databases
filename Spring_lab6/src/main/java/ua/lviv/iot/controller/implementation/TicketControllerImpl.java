package ua.lviv.iot.controller.implementation;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DTO.TicketDTO;
import ua.lviv.iot.controller.AbstractControllerImpl;
import ua.lviv.iot.domain.Ticket;
import ua.lviv.iot.mapper.AbstractMapper;
import ua.lviv.iot.mapper.implementation.TicketMapper;
import ua.lviv.iot.service.AbstractService;
import ua.lviv.iot.service.implementation.TicketService;

@RequestMapping(value = "/stop")
@RestController
@AllArgsConstructor
public class TicketControllerImpl extends AbstractControllerImpl<Ticket, TicketDTO> {
    private final TicketService ticketService;
    private final TicketMapper ticketMapper;

    @Override
    public AbstractService<Ticket> getService() {
        return ticketService;
    }

    @Override
    public AbstractMapper<Ticket, TicketDTO> getMapper() {
        return ticketMapper;
    }
}

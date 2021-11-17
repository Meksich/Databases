package ua.lviv.iot.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Ticket;
import ua.lviv.iot.repository.TicketRepository;
import ua.lviv.iot.service.AbstractService;

@AllArgsConstructor
@Service
public class TicketService extends AbstractService<Ticket> {
    private final TicketRepository ticketRepository;

    @Override
    public JpaRepository<Ticket, Integer> getRepository(){
        return ticketRepository;
    }
}

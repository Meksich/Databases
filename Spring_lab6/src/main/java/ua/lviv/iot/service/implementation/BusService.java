package ua.lviv.iot.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Bus;
import ua.lviv.iot.repository.BusRepository;
import ua.lviv.iot.service.AbstractService;

@AllArgsConstructor
@Service
public class BusService extends AbstractService<Bus> {
    private final BusRepository busRepository;

    @Override
    public JpaRepository<Bus, Integer> getRepository(){
        return busRepository;
    }
}

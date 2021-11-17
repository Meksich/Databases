package ua.lviv.iot.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Stop;
import ua.lviv.iot.repository.StopRepository;
import ua.lviv.iot.service.AbstractService;

@AllArgsConstructor
@Service
public class StopService extends AbstractService<Stop> {
    private final StopRepository stopRepository;

    @Override
    public JpaRepository<Stop, Integer> getRepository(){
        return stopRepository;
    }
}

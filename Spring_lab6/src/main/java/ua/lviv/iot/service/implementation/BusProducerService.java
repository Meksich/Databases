package ua.lviv.iot.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.BusProducer;
import ua.lviv.iot.repository.BusProducerRepository;
import ua.lviv.iot.service.AbstractService;

@AllArgsConstructor
@Service
public class BusProducerService extends AbstractService<BusProducer> {
    private final BusProducerRepository busProducerRepository;

    @Override
    public JpaRepository<BusProducer, Integer> getRepository(){
        return busProducerRepository;
    }
}

package ua.lviv.iot.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.BusRented;
import ua.lviv.iot.repository.BusRentedRepository;
import ua.lviv.iot.service.AbstractService;

@AllArgsConstructor
@Service
public class BusRentedService extends AbstractService<BusRented> {
    private final BusRentedRepository busRentedRepository;

    @Override
    public JpaRepository<BusRented, Integer> getRepository(){
        return busRentedRepository;
    }
}

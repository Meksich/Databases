package ua.lviv.iot.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Driver;
import ua.lviv.iot.repository.DriverRepository;
import ua.lviv.iot.service.AbstractService;

@AllArgsConstructor
@Service
public class DriverService extends AbstractService<Driver> {
    private final DriverRepository driverRepository;

    @Override
    public JpaRepository<Driver, Integer> getRepository(){
        return driverRepository;
    }
}
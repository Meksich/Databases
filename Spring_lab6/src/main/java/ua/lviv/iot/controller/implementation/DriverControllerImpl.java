package ua.lviv.iot.controller.implementation;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DTO.DriverDTO;
import ua.lviv.iot.controller.AbstractControllerImpl;
import ua.lviv.iot.domain.Driver;
import ua.lviv.iot.mapper.AbstractMapper;
import ua.lviv.iot.mapper.implementation.DriverMapper;
import ua.lviv.iot.service.AbstractService;
import ua.lviv.iot.service.implementation.DriverService;

@RequestMapping(value = "/driver")
@RestController
@AllArgsConstructor
public class DriverControllerImpl extends AbstractControllerImpl<Driver, DriverDTO> {
    private final DriverService driverService;
    private final DriverMapper driverMapper;

    @Override
    public AbstractService<Driver> getService() {
        return driverService;
    }

    @Override
    public AbstractMapper<Driver, DriverDTO> getMapper() {
        return driverMapper;
    }
}

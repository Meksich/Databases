package ua.lviv.iot.controller.implementation;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DTO.BusRentedDTO;
import ua.lviv.iot.controller.AbstractControllerImpl;
import ua.lviv.iot.domain.BusRented;
import ua.lviv.iot.mapper.AbstractMapper;
import ua.lviv.iot.mapper.implementation.BusRentedMapper;
import ua.lviv.iot.service.AbstractService;
import ua.lviv.iot.service.implementation.BusRentedService;

@RequestMapping(value = "/bus_rented")
@RestController
@AllArgsConstructor
public class BusRentedControllerImpl extends AbstractControllerImpl<BusRented, BusRentedDTO> {
    private final BusRentedService busRentedService;
    private final BusRentedMapper busRentedMapper;

    @Override
    public AbstractService<BusRented> getService() {
        return busRentedService;
    }

    @Override
    public AbstractMapper<BusRented, BusRentedDTO> getMapper() {
        return busRentedMapper;
    }
}

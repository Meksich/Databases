package ua.lviv.iot.controller.implementation;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DTO.BusDTO;
import ua.lviv.iot.controller.AbstractControllerImpl;
import ua.lviv.iot.domain.Bus;
import ua.lviv.iot.mapper.AbstractMapper;
import ua.lviv.iot.mapper.implementation.BusMapper;
import ua.lviv.iot.service.AbstractService;
import ua.lviv.iot.service.implementation.BusService;

@RequestMapping(value = "/bus")
@RestController
@AllArgsConstructor
public class BusControllerImpl extends AbstractControllerImpl<Bus, BusDTO> {
    private final BusService busService;
    private final BusMapper busMapper;

    @Override
    public AbstractService<Bus> getService() {
        return busService;
    }

    @Override
    public AbstractMapper<Bus, BusDTO> getMapper() {
        return busMapper;
    }
}

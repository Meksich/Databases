package ua.lviv.iot.controller.implementation;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DTO.StopDTO;
import ua.lviv.iot.controller.AbstractControllerImpl;
import ua.lviv.iot.domain.Stop;
import ua.lviv.iot.mapper.AbstractMapper;
import ua.lviv.iot.mapper.implementation.StopMapper;
import ua.lviv.iot.service.AbstractService;
import ua.lviv.iot.service.implementation.StopService;

@RequestMapping(value = "/stop")
@RestController
@AllArgsConstructor
public class StopControllerImpl extends AbstractControllerImpl<Stop, StopDTO> {
    private final StopService stopService;
    private final StopMapper stopMapper;

    @Override
    public AbstractService<Stop> getService() {
        return stopService;
    }

    @Override
    public AbstractMapper<Stop, StopDTO> getMapper() {
        return stopMapper;
    }
}

package ua.lviv.iot.controller.implementation;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DTO.RouteDTO;
import ua.lviv.iot.controller.AbstractControllerImpl;
import ua.lviv.iot.domain.Route;
import ua.lviv.iot.mapper.AbstractMapper;
import ua.lviv.iot.mapper.implementation.RouteMapper;
import ua.lviv.iot.service.AbstractService;
import ua.lviv.iot.service.implementation.RouteService;

@RequestMapping(value = "/route")
@RestController
@AllArgsConstructor
public class RouteControllerImpl extends AbstractControllerImpl<Route, RouteDTO> {
    private final RouteService routeService;
    private final RouteMapper routeMapper;

    @Override
    public AbstractService<Route> getService() {
        return routeService;
    }

    @Override
    public AbstractMapper<Route, RouteDTO> getMapper() {
        return routeMapper;
    }
}

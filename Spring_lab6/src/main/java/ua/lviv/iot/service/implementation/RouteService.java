package ua.lviv.iot.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Route;
import ua.lviv.iot.repository.RouteRepository;
import ua.lviv.iot.service.AbstractService;

@AllArgsConstructor
@Service
public class RouteService extends AbstractService<Route> {
    private final RouteRepository routeRepository;

    @Override
    public JpaRepository<Route, Integer> getRepository(){
        return routeRepository;
    }
}

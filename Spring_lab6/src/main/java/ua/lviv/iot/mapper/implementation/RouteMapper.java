package ua.lviv.iot.mapper.implementation;

import org.springframework.stereotype.Component;
import ua.lviv.iot.DTO.RouteDTO;
import ua.lviv.iot.domain.Route;
import ua.lviv.iot.mapper.AbstractMapper;

@Component
public class RouteMapper implements AbstractMapper<Route, RouteDTO> {
    @Override
    public RouteDTO map(Route route) {
        RouteDTO.RouteDTOBuilder routeDTOBuilder = RouteDTO.builder();
        routeDTOBuilder.id(route.getId());
        routeDTOBuilder.stopsNumber(route.getStopsNumber());
        routeDTOBuilder.length(route.getLength());
        routeDTOBuilder.averageTwoStopsLength(route.getAverageTwoStopsLength());
        routeDTOBuilder.wholeRoutePrice(route.getWholeRoutePrice());
        routeDTOBuilder.twoStopsPrice(route.getTwoStopsPrice());
        routeDTOBuilder.ticket(route.getTicket().getId());
        return routeDTOBuilder.build();
    }
}

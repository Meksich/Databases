package ua.lviv.iot.mapper.implementation;

import org.springframework.stereotype.Component;
import ua.lviv.iot.DTO.StopDTO;
import ua.lviv.iot.domain.Stop;
import ua.lviv.iot.mapper.AbstractMapper;

@Component
public class StopMapper implements AbstractMapper<Stop, StopDTO> {
    @Override
    public StopDTO map(Stop stop) {
        StopDTO.StopDTOBuilder stopDTOBuilder = StopDTO.builder();
        stopDTOBuilder.id(stop.getId());
        stopDTOBuilder.streetName(stop.getStreetName());
        stopDTOBuilder.city(stop.getCity());
        stopDTOBuilder.averageNumberOfPassengers(stop.getAverageNumberOfPassengers());
        stopDTOBuilder.isFinalStop(stop.getIsFinalStop());
        return stopDTOBuilder.build();
    }
}

package ua.lviv.iot.mapper.implementation;

import org.springframework.stereotype.Component;
import ua.lviv.iot.DTO.BusDTO;
import ua.lviv.iot.domain.Bus;
import ua.lviv.iot.mapper.AbstractMapper;

@Component
public class BusMapper implements AbstractMapper<Bus, BusDTO> {
    @Override
    public BusDTO map(Bus bus) {
        BusDTO.BusDTOBuilder busDTOBuilder = BusDTO.builder();
        busDTOBuilder.age(bus.getAge());
        busDTOBuilder.id(bus.getId());
        busDTOBuilder.passengerCapacity(bus.getPassengerCapacity());
        busDTOBuilder.mileage(bus.getMileage());
        busDTOBuilder.numberOfWheels(bus.getNumberOfWheels());
        busDTOBuilder.doorsNumber(bus.getDoorsNumber());
        busDTOBuilder.seats(bus.getSeats());
        busDTOBuilder.route(bus.getRoute().getId());
        busDTOBuilder.busRented(bus.getBusRented().getOwner());
        busDTOBuilder.busProducer(bus.getBusProducer().getOwnerName());
        return busDTOBuilder.build();
    }
}

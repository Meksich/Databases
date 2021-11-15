package ua.lviv.iot.mapper.implementation;

import org.springframework.stereotype.Component;
import ua.lviv.iot.DTO.BusRentedDTO;
import ua.lviv.iot.domain.BusRented;
import ua.lviv.iot.mapper.AbstractMapper;

@Component
public class BusRentedMapper implements AbstractMapper<BusRented, BusRentedDTO> {
    @Override
    public BusRentedDTO map(BusRented busRented) {
        BusRentedDTO.BusRentedDTOBuilder busRentedDTOBuilder = BusRentedDTO.builder();
        busRentedDTOBuilder.id(busRented.getId());
        busRentedDTOBuilder.owner(busRented.getOwner());
        busRentedDTOBuilder.rentalFee(busRented.getRentalFee());
        busRentedDTOBuilder.ownerCountry(busRented.getOwnerCountry());
        return busRentedDTOBuilder.build();
    }
}

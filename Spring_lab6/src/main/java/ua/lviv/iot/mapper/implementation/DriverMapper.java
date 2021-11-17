package ua.lviv.iot.mapper.implementation;

import org.springframework.stereotype.Component;
import ua.lviv.iot.DTO.DriverDTO;
import ua.lviv.iot.domain.Driver;
import ua.lviv.iot.mapper.AbstractMapper;

@Component
public class DriverMapper implements AbstractMapper<Driver, DriverDTO> {
    @Override
    public DriverDTO map(Driver driver) {
        DriverDTO.DriverDTOBuilder driverDTOBuilder = DriverDTO.builder();
        driverDTOBuilder.id(driver.getId());
        driverDTOBuilder.name(driver.getName());
        driverDTOBuilder.surname(driver.getSurname());
        driverDTOBuilder.driverLicenceCategory(driver.getDriverLicenceCategory());
        driverDTOBuilder.isReadyToDieForCompany(driver.getIsReadyToDieForCompany());
        driverDTOBuilder.sallaryInBucks(driver.getSallaryInBucks());
        return driverDTOBuilder.build();
    }
}

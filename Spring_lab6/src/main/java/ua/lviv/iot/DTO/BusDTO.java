package ua.lviv.iot.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BusDTO {
    private Integer id;
    private Integer age;
    private Integer passengerCapacity;
    private Integer mileage;
    private Integer numberOfWheels;
    private Integer doorsNumber;
    private Integer seats;
    private Integer route;
    private String busRented;
    private String busProducer;
}

package ua.lviv.iot.model.entity;

import lombok.*;
import ua.lviv.iot.model.annotations.NotInputable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "bus")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString

public class Bus{
    @Id
    @Column(name = "idbus")
    @NotInputable
    private Integer id;

    @Column(name = "age")
    @NotNull
    private Integer age;

    @Column(name = "passenger_capacity")
    private Integer passengerCapacity;

    @Column(name = "mileage")
    private Integer mileage;

    @Column(name = "number_of_wheels")
    @NotNull
    private Integer numberOfWheels;

    @Column(name = "doors_number")
    @NotNull
    private Integer doorsNumber;

    @Column(name = "seats")
    private Integer seats;

    @Column(name = "route_number")
    private Integer routeNumber;

    @Column(name = "bus_rented_idbus_rented")
    private Integer busRentedId;

    @Column(name = "bus_producer_id")
    @NotNull
    private Integer busProducerId;
}

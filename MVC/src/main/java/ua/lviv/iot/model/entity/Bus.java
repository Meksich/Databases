package ua.lviv.iot.model.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "bus")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class Bus{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "passenger_capacity")
    private Integer passengerCapacity;

    @Column(name = "mileage")
    private Integer mileage;

    @Column(name = "number_of_wheels", nullable = false)
    private Integer numberOfWheels;

    @Column(name = "doors_number", nullable = false)
    private Integer doorsNumber;

    @Column(name = "seats")
    private Integer seats;

    @ManyToOne
    @JoinColumn(name = "route_number", referencedColumnName = "id")
    private Route route;

    @OneToOne
    @JoinColumn(name = "bus_rented_id", referencedColumnName = "id")
    private BusRented busRented;

    @ManyToOne
    @JoinColumn(name = "bus_producer_id", referencedColumnName = "id", nullable = false)
    private BusProducer busProducer;

    @OneToOne(mappedBy = "bus")
    private Driver driver;

    @Override
    public String toString(){
        return "Bus: "
                + "\nid = " + id
                + "\nage = " + age
                + "\npassenger capacity  = " + passengerCapacity
                + "\nmileage = " + mileage
                + "\nnumber of wheels = " + numberOfWheels
                + "\ndoors number = " + doorsNumber
                + "\nroute = " + route
                + "\n";

    }
}

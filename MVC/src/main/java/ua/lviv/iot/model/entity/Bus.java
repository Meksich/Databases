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
    @Column(name = "idbus")
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
    @JoinColumn(name = "route_number", referencedColumnName = "number")
    private Route route;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bus_rented_idbus_rented", referencedColumnName = "idbus_rented")
    private BusRented busRented;

    @ManyToOne
    @JoinColumn(name = "bus_producer_id", referencedColumnName = "idbus_producer", nullable = false)
    private BusProducer busProducer;

    @OneToOne(mappedBy = "bus")
    private Driver driver;

    @Override
    public String toString(){
        return "Bus: ";

    }
}

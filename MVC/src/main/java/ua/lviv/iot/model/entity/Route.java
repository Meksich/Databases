package ua.lviv.iot.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Table(name = "route")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "number")
@ToString
@Entity
public class Route {
    @Id
    @Column(name = "number")
    private Integer number;

    @Column(name = "stops_number")
    private Integer stopsNumber;

    @Column(name = "length", nullable = false)
    private Integer length;

    @Column(name = "average_two_stops_length")
    private Integer averageTwoStopsLength;

    @Column(name = "whole_route_price", nullable = false)
    private Double wholeRoutePrice;

    @Column(name = "two_stops_price")
    private Double twoStopsPrice;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "last_stop", referencedColumnName = "street_name", nullable = false)
    private Stop lastStop;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ticket_idticket", referencedColumnName = "idticket", nullable = false)
    private Ticket ticket;

    @OneToMany(mappedBy = "route", fetch = FetchType.LAZY)
    private Collection<Bus> buses;
}

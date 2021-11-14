package ua.lviv.iot.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Table(name = "route")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

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

    @OneToOne
    @JoinColumn(name = "ticket_id", referencedColumnName = "id", nullable = false)
    private Ticket ticket;

    @OneToMany(mappedBy = "route", fetch = FetchType.LAZY)
    private Collection<Bus> buses;

    @Override
    public String toString(){
        return "Route: "
                + "\nid = " + id + ","
                + "\nstops number = " + stopsNumber + ","
                + "\naverage two stops length  = " + averageTwoStopsLength + ","
                + "\nwhole route price = " + wholeRoutePrice + ","
                + "\ntwo stops price = " + twoStopsPrice + ","
                + "\nticket id = " + ticket.getId()
                + "\n";

    }
}

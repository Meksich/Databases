package ua.lviv.iot.model.entity;

import lombok.*;
import ua.lviv.iot.model.annotations.NotInputable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "route")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "number")
@ToString

public class Route {
    @Id
    @Column(name = "number")
    @NotInputable
    private Integer number;

    @Column(name = "stops_number")
    private Integer stopsNumber;

    @Column(name = "length")
    @NotNull
    private Integer length;

    @Column(name = "average_two_stops_length")
    private Integer averageTwoStopsLength;

    @Column(name = "whole_route_price")
    @NotNull
    private Double wholeRoutePrice;

    @Column(name = "two_stops_price")
    private Double twoStopsPrice;

    @Column(name = "last_stop", length = 45)
    @NotNull
    private String lastStop;

    @Column(name = "point_of_departure", length = 45)
    @NotNull
    private String pointOfDeparture;

    @Column(name = "ticket_idticket")
    @NotNull
    private Integer ticketId;
}

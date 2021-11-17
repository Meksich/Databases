package ua.lviv.iot.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.lviv.iot.domain.Ticket;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RouteDTO {
    private Integer id;
    private Integer stopsNumber;
    private Integer length;
    private Integer averageTwoStopsLength;
    private Double wholeRoutePrice;
    private Double twoStopsPrice;
    private Integer ticket;
}

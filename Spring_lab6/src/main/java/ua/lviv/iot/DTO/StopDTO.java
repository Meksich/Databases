package ua.lviv.iot.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StopDTO {
    private Integer id;
    private String streetName;
    private String city;
    private Integer averageNumberOfPassengers;
    private Boolean isFinalStop;
}

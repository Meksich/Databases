package ua.lviv.iot.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BusProducerDTO {
    private Integer id;
    private String producerCountry;
    private String ownerName;
    private Integer factoryNewProduction;
    private Integer productionPerYear;
}

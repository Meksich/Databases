package ua.lviv.iot.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BusRentedDTO {
    private Integer id;
    private String owner;
    private String rentalFee;
    private String ownerCountry;
}

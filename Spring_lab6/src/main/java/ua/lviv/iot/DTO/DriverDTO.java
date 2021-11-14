package ua.lviv.iot.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DriverDTO {
    private Integer id;
    private String name;
    private String surname;
    private String driverLicenceCategory;
    private Integer sallaryInBucks;
    private Boolean isReadyToDieForCompany;
    private Integer bus;
}

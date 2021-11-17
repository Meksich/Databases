package ua.lviv.iot.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketDTO {
    private Integer id;
    private String speciality;
    private Integer price;
    private Integer width;
    private Integer height;
    private Integer producedNumber;
}

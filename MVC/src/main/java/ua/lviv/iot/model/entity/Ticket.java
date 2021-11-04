package ua.lviv.iot.model.entity;

import lombok.*;
import ua.lviv.iot.model.annotations.NotInputable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "ticket")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString

public class Ticket {
    @Id
    @Column(name = "idticket")
    @NotInputable
    private Integer id;

    @Column(name = "speciality", length = 45)
    private String speciality;

    @Column(name = "price")
    @NotNull
    private Integer price;

    @Column(name = "width")
    private Integer width;

    @Column(name = "height")
    private Integer height;

    @Column(name = "produced_number")
    private Integer producedNumber;
}

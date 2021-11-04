package ua.lviv.iot.model.entity;

import lombok.*;
import ua.lviv.iot.model.annotations.NotInputable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "stop")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "streetName")
@ToString

public class Stop{
    @Id
    @Column(name = "street_name", length = 60)
    @NotInputable
    private String streetName;

    @Column(name = "city", length = 45)
    @NotNull
    private String city;

    @Column(name = "average_number_of_passengers")
    private Integer averageNumberOfPassengers;

    @Column(name = "is_final_stop")
    @NotNull
    private Integer isFinalStop;
}

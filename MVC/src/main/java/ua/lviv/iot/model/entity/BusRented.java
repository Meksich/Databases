package ua.lviv.iot.model.entity;

import lombok.*;
import ua.lviv.iot.model.annotations.NotInputable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "bus_rented")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString

public class BusRented{

    @Id
    @Column(name = "idbus_rented")
    @NotInputable
    private Integer id;

    @Column(name = "owner", length = 45)
    @NotNull
    private String owner;

    @Column(name = "rental_fee", length = 45)
    @NotNull
    private String rentalFee;

    @Column(name = "owner_country", length = 45)
    private String ownerCountry;
}

package ua.lviv.iot.model.entity;

import lombok.*;
import ua.lviv.iot.model.annotations.NotInputable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "driver")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString

public class Driver {

    @Id
    @Column(name = "id")
    @NotInputable
    private Integer id;

    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "surname", length = 45)
    @NotNull
    private String surname;

    @Column(name = "driver_licence_category", length = 45)
    @NotNull
    private String driverLicenceCategory;

    @Column(name = "sallary_in_bucks")
    private Integer sallaryInBucks;

    @Column(name = "is_ready_to_die_for_company")
    @NotNull
    private Integer isReadyToDieForCompany;

    @Column(name = "bus_idbus")
    private Integer busIdbus;
}

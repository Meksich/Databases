package ua.lviv.iot.model.entity;

import lombok.*;

import javax.persistence.*;

@Table(name = "driver")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "surname", length = 45, nullable = false)
    private String surname;

    @Column(name = "driver_licence_category", length = 45, nullable = false)
    private String driverLicenceCategory;

    @Column(name = "sallary_in_bucks")
    private Integer sallaryInBucks;

    @Column(name = "is_ready_to_die_for_company", nullable = false)
    private Integer isReadyToDieForCompany;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bus_idbus", referencedColumnName = "idbus")
    private Bus bus;

    @OneToOne(mappedBy = "driver")
    private Security security;
}

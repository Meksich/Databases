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
    private Boolean isReadyToDieForCompany;

    @OneToOne
    @JoinColumn(name = "bus_id", referencedColumnName = "id")
    private Bus bus;

    @OneToOne(mappedBy = "driver")
    private Security security;

    @Override
    public String toString(){
        return "Driver: "
                + "\nid = " + id
                + "\nname = " + name
                + "\nsurname  = " + surname
                + "\ndriver licence category = " + driverLicenceCategory
                + "\nsallary = " + sallaryInBucks
                + "\nisReadyToDieForCompany? = " + isReadyToDieForCompany
                + "\nbus id = " + bus
                + "\n";

    }
}

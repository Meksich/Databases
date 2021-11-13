package ua.lviv.iot.model.entity;

import lombok.*;

import javax.persistence.*;

@Table(name = "bus_rented")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity
public class BusRented{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idbus_rented")
    private Integer id;

    @Column(name = "owner", length = 45, nullable = false)
    private String owner;

    @Column(name = "rental_fee", length = 45, nullable = false)
    private String rentalFee;

    @Column(name = "owner_country", length = 45)
    private String ownerCountry;

    @OneToOne(mappedBy = "busRented")
    private Bus bus;

    @Override
    public String toString(){
        return "Bus Rented: "
                + "\nid = " + id
                + "\nowner = " + owner
                + "\nrental fee = " + rentalFee
                + "\nowner country = " + ownerCountry;

    }
}

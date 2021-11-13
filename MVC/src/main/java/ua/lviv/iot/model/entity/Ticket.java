package ua.lviv.iot.model.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "ticket")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "speciality", length = 45)
    private String speciality;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "width")
    private Integer width;

    @Column(name = "height")
    private Integer height;

    @Column(name = "produced_number")
    private Integer producedNumber;

    @OneToOne(mappedBy = "ticket")
    private Route route;

    @Override
    public String toString(){
        return "Bus: "
                + "\nid = " + id
                + "\nspeciality = " + speciality
                + "\nprice  = " + price
                + "\nwidth = " + width
                + "\nheight = " + height
                + "\nproducedNumber = " + producedNumber
                + "\n";

    }
}

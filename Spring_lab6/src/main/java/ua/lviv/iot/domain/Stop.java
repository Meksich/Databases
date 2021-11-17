package ua.lviv.iot.domain;

import lombok.*;

import javax.persistence.*;

@Table(name = "stop")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
public class Stop{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "street_name", length = 60)
    private String streetName;

    @Column(name = "city", length = 45, nullable = false)
    private String city;

    @Column(name = "average_number_of_passengers")
    private Integer averageNumberOfPassengers;

    @Column(name = "is_final_stop", nullable = false)
    private Boolean isFinalStop;

    @Override
    public String toString(){
        return "Stop: "
                + "\nid = " + id + ","
                + "\nstreet name = " + streetName + ","
                + "\ncity  = " + city + ","
                + "\naverage_number_of_passengers = " + averageNumberOfPassengers + ","
                + "\nis final stop? = " + isFinalStop
                + "\n";

    }
}

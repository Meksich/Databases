package ua.lviv.iot.model.entity;

import lombok.*;

import javax.persistence.*;

@Table(name = "stop")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "streetName")
@ToString
@Entity
public class Stop{
    @Id
    @Column(name = "street_name", length = 60)
    private String streetName;

    @Column(name = "city", length = 45, nullable = false)
    private String city;

    @Column(name = "average_number_of_passengers")
    private Integer averageNumberOfPassengers;

    @Column(name = "is_final_stop", nullable = false)
    private Integer isFinalStop;

    @OneToOne(mappedBy = "lastStop")
    private Route routeLast;

    @Column(name = "point_of_departure", length = 45, nullable = false)
    private String pointOfDeparture;
}

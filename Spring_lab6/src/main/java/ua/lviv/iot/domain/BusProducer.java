package ua.lviv.iot.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Table(name = "bus_producer")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
public class BusProducer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "producer_country", length = 45, nullable = false)
    private String producerCountry;

    @Column(name = "owner_name", length = 45, nullable = false)
    private String ownerName;

    @Column(name = "factory_new_production")
    private Integer factoryNewProduction;

    @Column(name = "production_per_year", nullable = false)
    private Integer productionPerYear;

    @OneToMany(mappedBy = "busProducer", fetch = FetchType.LAZY)
    private Set<Bus> buses;

    @Override
    public String toString() {
        return "Bus producer: "
                + "\nid = " + id + ","
                + "\nproducer country = " + producerCountry + ","
                + "\nowner name  = " + ownerName + ","
                + "\nfactory new production = " + factoryNewProduction + ","
                + "\nproduction per year = " + productionPerYear
                + "\n";
    }
}

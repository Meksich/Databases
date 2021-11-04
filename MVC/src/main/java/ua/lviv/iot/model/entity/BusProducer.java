package ua.lviv.iot.model.entity;

import lombok.*;
import ua.lviv.iot.model.annotations.NotInputable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "bus_producer")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString

public class BusProducer {
    @Id
    @Column(name = "idbus_producer")
    @NotInputable
    private Integer id;

    @Column(name = "producer_country", length = 45)
    @NotNull
    private String producerCountry;

    @Column(name = "owner_name", length = 45)
    @NotNull
    private String ownerName;

    @Column(name = "factory_new_production")
    private Integer factoryNewProduction;

    @Column(name = "production_per_year")
    @NotNull
    private Integer productionPerYear;
}

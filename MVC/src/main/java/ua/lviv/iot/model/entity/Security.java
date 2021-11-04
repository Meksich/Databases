package ua.lviv.iot.model.entity;

import lombok.*;
import ua.lviv.iot.model.annotations.NotInputable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "security")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "login")
@ToString

public class Security{
    @Id
    @Column(name = "login", length = 45)
    @NotInputable
    private String login;

    @Column(name = "password", length = 45)
    @NotNull
    private String password;

    @Column(name = "driver_id")
    @NotNull
    private Integer driverId;
}

package ua.lviv.iot.model.entity;

import lombok.*;

import javax.persistence.*;

@Table(name = "security")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "login")
@ToString
@Entity
public class Security{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "login", length = 45)
    private String login;

    @Column(name = "password", length = 45, nullable = false)
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "driver_id", referencedColumnName = "id", nullable = false)
    private Driver driver;

    public Security(String login, String password) {
        this.login = login;
        this.password = password;
    }
}

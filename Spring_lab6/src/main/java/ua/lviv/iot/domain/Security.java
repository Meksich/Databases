package ua.lviv.iot.domain;

import lombok.*;

import javax.persistence.*;

@Table(name = "security")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
public class Security{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "password", length = 45, nullable = false)
    private String password;

    @OneToOne
    @JoinColumn(name = "driver_id", referencedColumnName = "id", nullable = false)
    private Driver driver;

    public Security(Integer id, String password) {
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString(){
        return "Security: "
                + "\nid = " + id + ","
                + "\npassword = " + password + ","
                + "\ndriver id  = " + driver.getId()
                + "\n";

    }
}

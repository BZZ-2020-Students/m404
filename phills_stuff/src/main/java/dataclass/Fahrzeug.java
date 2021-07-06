package dataclass;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "UserAccount")
@Inheritance(strategy = InheritanceType.JOINED)
public class Fahrzeug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String modell;
    private String hersteller;
    private LocalDate baujahr;
}

package kg.megacom.finally_test.models;

import kg.megacom.finally_test.enums.Status;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String imageUri;

    @Enumerated(EnumType.STRING)
    private Status status;
}

package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.*;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Utilisateur")
public class Utilisateur {

    @EqualsAndHashCode.Exclude
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NonNull
    private String login;
    @NonNull
    private String password;
    @NonNull
    private String  role;
}

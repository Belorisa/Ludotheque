package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.*;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Adresse")
public class Adresse {
    @EqualsAndHashCode.Exclude
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer no_adresse;

    @NonNull
    @Column(length = 100,nullable = false)
    private String rue;

    @NonNull
    @Column(length = 15,nullable = false)
    private String codePostal;

    @NonNull
    @Column(length = 100,nullable = false)
    private String ville;


}

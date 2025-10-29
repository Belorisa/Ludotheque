package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.*;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLIENTS")
public class Client {
    @EqualsAndHashCode.Exclude
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer noClient;

    @NonNull
    @Column(length = 100,nullable = false)
    private String nom;

    @NonNull
    @Column(length = 100,nullable = false)
    private String prenom;

    @NonNull
    @Column(length = 100,nullable = false,unique = true)
    private String email;

    @Column(length = 15)
    String telephone;

    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    @NonNull
    @JoinColumn(name = "no_adresse",nullable = false)
    private Adresse adresse;
}

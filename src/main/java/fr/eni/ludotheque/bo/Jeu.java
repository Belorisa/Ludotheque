package fr.eni.ludotheque.bo;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Jeux")
public class Jeu {

    @EqualsAndHashCode.Exclude
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NonNull
    @Column(unique = true, nullable = false)
    private String titre;

    @NonNull
    @Column(unique = true, nullable = false)
    private String reference;

    @Nullable
    @Column( nullable = true)
    private Integer age_min;

    @Nullable
    @Column( nullable = true)
    private String Description;

    @Nullable
    @Column( nullable = true)
    private Integer duree;

    @NonNull
    @Column( nullable = false)
    private Double tarif_jour;

    @ManyToMany
    @Nullable
    @JoinTable(name = "jeux_genre",
    joinColumns = @JoinColumn(name = "jeux_id"),
    inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private Set<Genre> genres = new HashSet<>(); ;

    @OneToMany(mappedBy = "jeu")
    private Set<Exemplaire> exemplaires = new HashSet<>();


}

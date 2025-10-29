package fr.eni.ludotheque.bo;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Genre")
public class Genre {
    @EqualsAndHashCode.Exclude
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NonNull
    @Column(nullable = false)
    private String libelle;

    @ManyToMany(mappedBy = "genres" )
    @Nullable
    private ArrayList<Jeu> jeux;

}

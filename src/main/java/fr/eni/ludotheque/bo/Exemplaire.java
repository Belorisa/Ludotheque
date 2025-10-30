package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Exemplaire")
public class Exemplaire {

    @EqualsAndHashCode.Exclude
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NonNull
    @Column(length = 13,nullable = false,unique = true)
    private String codebarre;

    @NonNull
    @Basic(optional = false)
    private Boolean louable;

    @ManyToOne
    @NonNull
    @JoinColumn(name = "jeux_id_jeux")
    private Jeu jeu;

}

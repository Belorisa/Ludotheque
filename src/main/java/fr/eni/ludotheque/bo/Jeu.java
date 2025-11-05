package fr.eni.ludotheque.bo;

import jakarta.annotation.Nullable;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Document("Jeux")
public class Jeu {

    @Id
    private String id;

    @NonNull
    private String titre;

    @NonNull
    private String reference;

    private Integer age_min;

    private String Description;

    private Integer duree;

    @NonNull
    private Double tarif_jour;

    private Set<Genre> genres = new HashSet<>(); ;

    private Set<Exemplaire> exemplaires = new HashSet<>();


}

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

    @Nullable
    private Integer age_min;

    @Nullable
    private String Description;

    @Nullable
    private Integer duree;

    @NonNull
    private Double tarif_jour;

    private Set<Genre> genres = new HashSet<>(); ;

    private Set<Exemplaire> exemplaires = new HashSet<>();


}

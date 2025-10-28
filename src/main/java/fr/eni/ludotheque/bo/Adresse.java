package fr.eni.ludotheque.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Adresse {
    @EqualsAndHashCode.Exclude
    private Integer no_adresse;

    @NonNull
    private String rue;

    @NonNull
    private String code_postal;

    @NonNull
    private String ville;
}

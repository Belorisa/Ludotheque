package fr.eni.ludotheque.bo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Adresse {


    @NonNull
    private String rue;

    @NonNull
    private String codePostal;

    @NonNull
    private String ville;


}

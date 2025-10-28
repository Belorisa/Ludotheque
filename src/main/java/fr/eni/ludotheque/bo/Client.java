package fr.eni.ludotheque.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private Integer noClient;
    @NonNull
    private String nom;
    @NonNull
    private String prenom;
    @NonNull
    private String email;

    String telephone;
    Adresse adresse;
}

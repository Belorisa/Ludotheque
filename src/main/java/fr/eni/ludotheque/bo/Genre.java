package fr.eni.ludotheque.bo;


import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Genre {

    @NonNull
    private String libelle;

}

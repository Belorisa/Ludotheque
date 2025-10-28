package fr.eni.ludotheque.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Genre {
    private Integer id;
    @NonNull
    private String libelle;

}

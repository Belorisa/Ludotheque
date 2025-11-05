package fr.eni.ludotheque.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Location {

    @NonNull private Date debut;
    @NonNull private Date fin;
    @NonNull private Double tarif_jour;

    @NonNull private Facture facture;
}

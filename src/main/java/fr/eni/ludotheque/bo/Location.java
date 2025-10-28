package fr.eni.ludotheque.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.Date;

@Data
@AllArgsConstructor
public class Location {
    private Integer no_location;
    @NonNull private Date debut;
    @NonNull private Date fin;
    @NonNull private double tarif_jour;
    @NonNull private Client client;
    @NonNull private Facture facture;
}

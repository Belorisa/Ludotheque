package fr.eni.ludotheque.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Facture {

    @NonNull
    private Date date_paiement;

}

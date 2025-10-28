package fr.eni.ludotheque.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.Date;

@Data
@AllArgsConstructor
public class Facture {
   private Integer id;
    @NonNull
    private Date date_paiement;

}

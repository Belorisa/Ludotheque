package fr.eni.ludotheque.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;

@Data
@AllArgsConstructor

public class Jeu {
    private Integer id;
    @NonNull
    private String titre;
    @NonNull
    private String reference;
    @NonNull
    private int age_min;
    @NonNull
    private String Description;
    @NonNull
    private int duree;
    @NonNull
    private double tarif_jour;

    @NonNull
    private ArrayList<Exemplaire> exemplaires;

    @NonNull
    private ArrayList<Genre> genres;

}

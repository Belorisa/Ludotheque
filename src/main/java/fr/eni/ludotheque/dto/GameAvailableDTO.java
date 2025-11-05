package fr.eni.ludotheque.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.bson.types.ObjectId;

@AllArgsConstructor
@Getter
public class GameAvailableDTO {
    private String titre;
    private int exemplairesTotal;
    private int exemplairesDisponibles;
}

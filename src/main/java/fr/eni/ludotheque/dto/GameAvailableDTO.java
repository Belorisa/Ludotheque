package fr.eni.ludotheque.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class GameAvailableDTO {
    private Integer id;
    private String nom;
    private Long nbDisponibles;


}

package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Jeu;
import fr.eni.ludotheque.dto.GameAvailableDTO;

import java.util.List;

public interface JeuxService {

    List<GameAvailableDTO> getJeux();

}

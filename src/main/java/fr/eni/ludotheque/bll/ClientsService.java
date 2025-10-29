package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Client;
import fr.eni.ludotheque.dto.ClientDto;
import org.springframework.stereotype.Service;

public interface ClientsService {
    Client ajouterClient(ClientDto client);
}

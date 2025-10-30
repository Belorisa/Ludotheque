package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Adresse;
import fr.eni.ludotheque.bo.Client;
import fr.eni.ludotheque.dto.ClientDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClientsService {
    Client ajouterClient(ClientDto client);
    List<Client> findClientsByName(String name);
    Client ModificationClient(ClientDto client);
    Client ModificationAdresse(Adresse adresse);
}

package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Adresse;
import fr.eni.ludotheque.bo.Client;
import fr.eni.ludotheque.dto.ClientDto;

import java.util.List;

public interface ClientsService {
    Client ajouterClient(ClientDto client);
    List<Client> findClientsByName(String name);
    Client getClientById(Integer id);
    Client modificationClient(ClientDto client,Integer id);
    Client modificationAdresse(Adresse adresse,Integer id);
    void supprimerClient(Integer id);
}

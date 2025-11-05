package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Adresse;
import fr.eni.ludotheque.bo.Client;
import fr.eni.ludotheque.dto.ClientDto;
import org.bson.types.ObjectId;

import java.util.List;

public interface ClientsService {
    Client ajouterClient(ClientDto client);
    List<Client> findClientsByName(String name);
    Client getClientById(ObjectId id);
    Client modificationClient(ClientDto client,ObjectId id);
    Client modificationAdresse(Adresse adresse,ObjectId id);
    void supprimerClient(ObjectId id);
}

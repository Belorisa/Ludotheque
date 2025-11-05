package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.bo.Client;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface ClientsRepository extends MongoRepository<Client, String> {
    List<Client> findClientsByNomStartingWith(String nom);

    Client findClientBy_id(ObjectId id);
}

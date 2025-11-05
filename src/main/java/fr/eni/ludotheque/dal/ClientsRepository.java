package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.bo.Client;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ClientsRepository extends MongoRepository<Client, String> {

}

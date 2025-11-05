package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.bo.Utilisateur;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<Utilisateur, String> {

    Utilisateur findUtilisateurByLogin(String login);

}

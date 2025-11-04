package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.bo.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Utilisateur, Integer> {
    Utilisateur findUtilisateurByLogin(String username);
}

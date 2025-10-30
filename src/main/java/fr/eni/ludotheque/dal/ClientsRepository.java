package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.bo.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientsRepository extends JpaRepository<Client, Integer> {
    List<Client> findByNomStartingWithIgnoreCase(String name);
    Client getClientByNoClient(int noClient);

}

package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.bo.Client;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ClientsRepositoryTest {
    @Autowired
    private ClientsRepository clientsRepository;

    @Test
    @DisplayName("Test d('ajout d'un clients en BD - cas ")
    void ajoutClient() {
        // AAA
        //Arrange = Prep du test
        Client client = new Client("bob","dupont","bob.dupont@gmail.fr");
        client.setTelephone("01010101");

        Client newClient = clientsRepository.save(client);
        assertNotNull(newClient);
        assertNotNull(newClient.getTelephone());
        assertEquals(client.getTelephone(),newClient.getTelephone());

        clientsRepository.flush();
        Optional<Client> searchClientOpt = clientsRepository.findById(newClient.getNoClient());
        assertTrue(searchClientOpt.isPresent());

    }
}

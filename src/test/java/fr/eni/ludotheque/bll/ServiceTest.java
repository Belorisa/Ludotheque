package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Client;
import fr.eni.ludotheque.dal.ClientsRepository;
import fr.eni.ludotheque.dto.ClientDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
public class ServiceTest {
    @Autowired
    private ClientsService clientsService;

    @Autowired
    private ClientsRepository clientsRepository;

    @Test
    @DisplayName("test de l'ajout d'un client ")
    public void testAjouterClientEtAdresse() {
        clientsRepository.deleteAll();
        ClientDto clientDto = new ClientDto("Dylan", "Bob", "Bob.Dylan@eni.fr", "0606060606"
        ,"5 Rue Pierre","44465","Nantes");
        Client newClient = clientsService.ajouterClient(clientDto);
    }


}

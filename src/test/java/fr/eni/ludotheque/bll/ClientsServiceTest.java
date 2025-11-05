package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Adresse;
import fr.eni.ludotheque.bo.Client;
import fr.eni.ludotheque.dal.ClientsRepository;
import fr.eni.ludotheque.dto.ClientDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ClientsServiceTest {
    @Autowired
    private ClientsService clientsService;

    @Autowired
    private ClientsRepository clientsRepository;

    @Test
    @DisplayName("test de l'ajout d'un client cas positif")
    public void testAjouterClientEtAdresseCasPositif() {

    }

    @Test
    @DisplayName("testchercherClientsParNom")
    public void testChercherClientsParNom() {
//        String nomRecherche = "Bob";
//
//        Adresse adresse1 = new Adresse("5 rue Port","44000","Nantes");
//        Client client1 = new Client("Bob","dupont","bob.dupont@gmail.fr",adresse1);
//        clientsRepository.save(client1);
//
//        Adresse adresse2 = new Adresse("5 rue Port","44000","Nantes");
//        Client client2 = new Client("Alice","dupont","Alice.dupont@gmail.fr",adresse2);
//        clientsRepository.save(client2);
//
//        clientsRepository.flush();
//
//        List<Client> clients = clientsService.findClientsByName(nomRecherche);
//
//        assertNotNull(clients);
//        System.out.println(clients);

    }

    @Test
    @DisplayName("testModificationComplèteClient")
    public void testModificationCompleteClient(){

//        ClientDto clientDto = new ClientDto("Philipe","Daniel","philipe.daniel@gmail.fr","0606060606","59 rue du Pendu","95400","Treilli");
//
//        Adresse adresse1 = new Adresse("5 rue Port","44000","Nantes");
//        Client client1 = new Client("Bob","dupont","bob.dupont@gmail.fr",adresse1);
//        clientsRepository.saveAndFlush(client1);
//        Client newClient = clientsService.modificationClient(clientDto);
//
//
//        assertNotNull(newClient);
//        assertNotNull(newClient.getNoClient());
    }

    @Test
    @DisplayName("testNonPresenceClient")
    public void testNonPresenceClient(){
//        ClientDto clientDto = new ClientDto("Philipe","Daniel","philipe.daniel@gmail.fr","0606060606","59 rue du Pendu","95400","Treilli");
//        Client newClient = clientsService.modificationClient(clientDto);
//
//
//        assertNull(newClient);
    }

    @Test
    @DisplayName("testChangementAdresse")
    public void testChangementAdresse(){
//
//        Adresse adresse1 = new Adresse("5 rue Port","44000","Nantes");
//        Client client1 = new Client("Bob","Dupont","bob.dupont@gmail.fr",adresse1);
//        clientsRepository.saveAndFlush(client1);
//        Adresse adresse2 = new Adresse("59 rue du Pendu","95400","Treilli");
//        Client newClient = clientsService.modificationAdresse(adresse2);
//
//
//        assertNotNull(newClient);
//        assertNotNull(newClient.getNoClient());
//        assertNotNull(newClient.getAdresse().getNo_adresse());
//        assertEquals("Treilli",newClient.getAdresse().getVille());
    }
}

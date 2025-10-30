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
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ClientsServiceTest {
    @Autowired
    private ClientsService clientsService;

    @MockitoBean
    private ClientsRepository clientsRepository;

    @Test
    @DisplayName("test de l'ajout d'un client cas positif")
    public void testAjouterClientEtAdresseCasPositif() {
        //Arrange
        ClientDto clientDto = new ClientDto("nom1","p1","p1.nom1@eni.fr","01101225468","rue1","44400","Rezé");
        Client fauxClient = new Client();
        fauxClient.setAdresse(new Adresse());
        BeanUtils.copyProperties(clientDto,fauxClient);
        BeanUtils.copyProperties(clientDto,fauxClient.getAdresse());
        fauxClient.setNoClient(123);
        fauxClient.getAdresse().setNo_adresse(456);
        when(clientsRepository.save(any(Client.class))).thenReturn(fauxClient);

        //Act
        Client newClient = clientsService.ajouterClient(clientDto);
        //Assert
        assertNotNull(newClient);
        assertNotNull(newClient.getNoClient());
        assertNotNull(newClient.getAdresse().getNo_adresse());
    }
}

package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Adresse;
import fr.eni.ludotheque.bo.Client;
import fr.eni.ludotheque.dal.ClientsRepository;
import fr.eni.ludotheque.dto.ClientDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientsServiceImpl implements ClientsService {

    private ClientsRepository clientsRepository;

    public ClientsServiceImpl(ClientsRepository clientsRepository) {

    }

    @Override
    public Client ajouterClient(ClientDto clientDto) {

        Client client = new Client();

        BeanUtils.copyProperties(clientDto, client );
        Adresse adresse = new Adresse();
        BeanUtils.copyProperties(clientDto, adresse );
        client.setAdresse(adresse);

        Client newClient = clientsRepository.save(client);
        return newClient;
    }


}

package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Adresse;
import fr.eni.ludotheque.bo.Client;
import fr.eni.ludotheque.dal.ClientsRepository;
import fr.eni.ludotheque.dto.ClientDto;
import org.bson.types.ObjectId;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientsServiceImpl implements ClientsService {


    private final ClientsRepository clientsRepository;

    @Autowired
    public ClientsServiceImpl(ClientsRepository clientsRepository) {
        this.clientsRepository = clientsRepository;
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

    @Override
    public List<Client> findClientsByName(String name) {
        return clientsRepository.findClientsByNomStartingWith(name);
    }

    @Override
    public Client getClientById(ObjectId id) {
        System.out.println("DebugGetClientByid");
        return clientsRepository.findClientBy_id(id);
    }

    @Override
    public Client modificationClient(ClientDto i,ObjectId id) {
        Client client = clientsRepository.findClientBy_id(id);

        BeanUtils.copyProperties(i, client );

        Adresse adresse = new Adresse();
        BeanUtils.copyProperties(i, adresse );

        client.setAdresse(adresse);

        Client newClient = clientsRepository.save(client);
        return newClient;

    }

    @Override
    public Client modificationAdresse(Adresse adresse,ObjectId id) {
        Client client = clientsRepository.findClientBy_id(id);
        client.setAdresse(adresse);
        return clientsRepository.save(client);
    }

    @Override
    public void supprimerClient(ObjectId id) {

    }


}

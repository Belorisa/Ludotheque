package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Adresse;
import fr.eni.ludotheque.bo.Client;
import fr.eni.ludotheque.dal.ClientsRepository;
import fr.eni.ludotheque.dto.ClientDto;
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
        return clientsRepository.findByNomStartingWithIgnoreCase(name);
    }

    @Override
    public Client getClientById(Integer id) {
        return clientsRepository.findById(id).get();
    }

    @Override
    public Client modificationClient(ClientDto i,Integer id) {
        Client clientToChange =  clientsRepository.getClientByNoClient(id);
        if(clientToChange == null){
            return null;
        }
        BeanUtils.copyProperties(i, clientToChange );
        Adresse adresse = new Adresse();
        BeanUtils.copyProperties(i, adresse );
        modificationAdresse(adresse,id);

        return clientToChange;
    }

    @Override
    public Client modificationAdresse(Adresse adresse,Integer id) {
        Client clientToChange =  clientsRepository.getClientByNoClient(id);
        if(clientToChange == null){
            return null;
        }
        clientToChange.getAdresse().setRue(adresse.getRue());
        clientToChange.getAdresse().setVille(adresse.getVille());
        clientToChange.getAdresse().setCodePostal(adresse.getCodePostal());
        clientsRepository.save(clientToChange);
        return clientToChange;
    }

    @Override
    public void supprimerClient(Integer id) {
        clientsRepository.deleteById(id);
        clientsRepository.flush();
    }


}

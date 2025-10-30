package fr.eni.ludotheque.rest;

import fr.eni.ludotheque.bll.ClientsService;
import fr.eni.ludotheque.bll.JeuxService;
import fr.eni.ludotheque.bo.Adresse;
import fr.eni.ludotheque.bo.Client;
import fr.eni.ludotheque.bo.Jeu;
import fr.eni.ludotheque.dal.JeuRepository;
import fr.eni.ludotheque.dto.ClientDto;
import fr.eni.ludotheque.dto.GameAvailableDTO;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClientsRestController {

    private final JeuRepository jeuRepository;
    @NonNull
    private ClientsService clientsService;

    @NonNull
    private JeuxService jeuService;



    @PostMapping("/clients")
    public ResponseEntity<Client> ajouterclients(@RequestBody ClientDto clientDto) {
        //Client client = new Client("n1","s1","n1.s1@eni.fr",new Adresse("rue1","cp1","ville1"));

        Client client = clientsService.ajouterClient(clientDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(client);
    }

    @DeleteMapping("/clients/{id}")
    public ResponseEntity<Void> deleteClients(@PathVariable Integer id) {
        clientsService.supprimerClient(id);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/clients/{id}")
    public ResponseEntity<Client> changeClients(@RequestBody ClientDto clientDto, @PathVariable Integer id) {
        Client client = clientsService.modificationClient(clientDto,id);

        return ResponseEntity.status(HttpStatus.OK).body(client);
    }

    @PatchMapping("clients/{id}")
    public ResponseEntity<Client> changeAdresse(@RequestBody Adresse adresse, @PathVariable Integer id) {
        clientsService.modificationAdresse(adresse, id);

        return ResponseEntity.status(HttpStatus.OK).build();

    }


    @GetMapping("clients/{name}")
    public ResponseEntity<List<Client>> getClientByName(@PathVariable String name) {
        List<Client> clients = clientsService.findClientsByName(name);

        return ResponseEntity.status(HttpStatus.OK).body(clients);
    }

    @GetMapping("clients/id/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Integer id) {
        Client client = clientsService.getClientById(id);

        return ResponseEntity.status(HttpStatus.OK).body(client);
    }

    @GetMapping("jeux")
    public ResponseEntity<List<GameAvailableDTO>> getAllJeux() {
        List<GameAvailableDTO> jeux = jeuRepository.findGamesWithAvailableCount();
    }

}

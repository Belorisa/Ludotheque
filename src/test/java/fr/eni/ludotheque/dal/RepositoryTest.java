package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.bo.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RepositoryTest {
    @Autowired
    private ClientsRepository clientsRepository;

    @Autowired
    private JeuRepository jeuRepository;


    @Test
    @DisplayName("Test d'ajout d'un clients en BD")
    void ajoutClient() {
        clientsRepository.deleteAll();
        // AAA
        //Arrange = Prep du test
        //Act
        //Assert
        Adresse adresse = new Adresse("5 Rue Pierre","44465","Phoge");
        Client client = new Client("Bob", "Dylan", "Bob.Dylan@eni.fr", "0606060606", adresse);

        Client newClient = clientsRepository.save(client);

    }

    @Test
    @DisplayName("Test d'ajout d'un jeu en BD")
    void AjoutJeu(){
        jeuRepository.deleteAll();
        Jeu jeu = new Jeu("Catan","142615436",20.0);
        jeu.getGenres().add(new Genre("Stratégie"));
        jeu.getGenres().add(new Genre("Réflexion"));
        jeu.getExemplaires().add(new Exemplaire("1324615",true));
        jeu.getExemplaires().add(new Exemplaire("1324616",true));

        Jeu jeu2 = new Jeu("Monopoly","142615436",20.0);
        jeu2.getGenres().add(new Genre("Stratégie"));
        jeu2.getExemplaires().add(new Exemplaire("13145615",true));
        jeu2.getExemplaires().add(new Exemplaire("21216456",false));
        jeuRepository.save(jeu2);
        jeuRepository.save(jeu);
    }






}

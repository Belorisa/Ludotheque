package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.bo.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ClientsRepositoryTest {
    @Autowired
    private ClientsRepository clientsRepository;

    @Autowired
    private JeuRepository jeuRepository;


    @Test
    @DisplayName("Test d('ajout d'un clients en BD - cas ")
    void ajoutClient() {
        // AAA
        //Arrange = Prep du test
        //Act
        //Assert
        Adresse adresse = new Adresse();
        Client client = new Client("Bob", "Dylan", "Bob.Dylan@eni.fr", "0606060606", adresse);

        Client newClient = clientsRepository.save(client);


    }

    @Test
    @DisplayName("Test d('ajout d'un Genre en BD ")
    void ajoutGenre() {


    }

    @Test
    @DisplayName("Test d'ajout de 2 genre a un jeu en BD ")
    void ajoutGenreToJeu() {
//        // AAA
//        //Arrange = Prep du test
//        //Act
//        //Assert
//        Genre genre = new Genre("Reflexion");
//        Genre genre2 = new Genre("Action");
//
//
//        Jeu jeu = new Jeu("Cluedo", "1344521", 3.0);
//
//        jeu.getGenres().add(genre);
//        jeu.getGenres().add(genre2);
//
//
//        Genre newGenre = genreRepository.save(genre);
//        Genre newGenre2 = genreRepository.save(genre2);
//
//
//        Jeu newJeu = jeuRepository.save(jeu);
//
//        assertNotNull(newGenre);
//        assertNotNull(newGenre2);
//        assertEquals(newGenre2, genre2);
//        assertEquals(newGenre, genre);
//        assertEquals(newJeu, jeu);
//
//        genreRepository.flush();
//        jeuRepository.flush();

    }

    @Test
    @DisplayName("Test d'ajout de 2 exemplaire a un jeu en BD ")
    void ajoutExemplaireToJeu() {
//        // AAA
//        //Arrange = Prep du test
//        //Act
//        //Assert
//        Jeu jeu = new Jeu("Cluedo", "1344521", 3.0);
//
//        Exemplaire exemplaire = new Exemplaire("21251436", true, jeu);
//        Exemplaire exemplaire2 = new Exemplaire("6412578", false, jeu);
//
//        Jeu newJeu = jeuRepository.save(jeu);
//
//        Exemplaire newExemplaire = exemplaireRepository.save(exemplaire);
//        Exemplaire newExemplaire2 = exemplaireRepository.save(exemplaire2);
//
//
//        assertEquals(newJeu, jeu);
//
//        exemplaireRepository.flush();
//        jeuRepository.flush();

    }
}

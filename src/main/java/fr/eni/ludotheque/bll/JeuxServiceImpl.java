package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Jeu;
import fr.eni.ludotheque.dal.JeuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JeuxServiceImpl implements JeuxService {

    private final JeuRepository jeuRepository;

    @Autowired
    public JeuxServiceImpl(JeuRepository jeuRepository) {
        this.jeuRepository = jeuRepository;
    }


    @Override
    public Jeu trouverJeuParNoJeu(Integer noJeu) {
        Optional<Jeu> optJeu = jeuRepository.findById(noJeu);

        if(optJeu.isEmpty()) {
            throw new DataNotFound("Jeu", noJeu);
        }
        return optJeu.get();

    }

    @Override
    public List<Jeu> listeJeuxCatalogue(String filtreTitre) {
        List<Jeu> jeux = jeuRepository.findAllJeuxAvecNbExemplaires(filtreTitre);

        for(Jeu jeu : jeux) {
            int nbExemplairesDisponibles = exemplaireRepository.nbExemplairesDisponibleByNoJeu(jeu.getNoJeu());
            jeu.setNbExemplairesDisponibles(nbExemplairesDisponibles);
        }

        return jeux;
    }



}

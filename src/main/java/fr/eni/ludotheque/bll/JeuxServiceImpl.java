package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Jeu;
import fr.eni.ludotheque.dal.JeuRepository;
import fr.eni.ludotheque.dal.JeuRepositoryCustom;
import fr.eni.ludotheque.dto.GameAvailableDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JeuxServiceImpl implements JeuxService {

    @Autowired
    JeuRepositoryCustom jeuxRepositoryCustom;

    @Autowired
    JeuRepository jeuxRepository;

    @Override
    public List<GameAvailableDTO>  getJeux() {
        //return  jeuxRepositoryCustom.findAllByJeux() ;
        return jeuxRepository.findAllGameAvailable();
    }
}

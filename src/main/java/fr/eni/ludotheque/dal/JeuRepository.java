package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.bo.Jeu;


import fr.eni.ludotheque.dto.GameAvailableDTO;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


public interface JeuRepository extends MongoRepository<Jeu, String> {

    @Aggregation(pipeline = {
            "{ $project: { " +
                    "titre: 1, " +
                    "exemplairesTotal: { $size: '$exemplaires' }, " +
                    "exemplairesDisponibles: { $size: { $filter: { input: '$exemplaires', as: 'exemplaire', cond: { $eq: ['$$exemplaire.louable', true] } } } } } }",
            "{ $match: { exemplairesDisponibles: { $gt: 0 } } }"
    })
    List<GameAvailableDTO> findAllGameAvailable();

}

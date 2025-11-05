package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.dto.GameAvailableDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.core.aggregation.ComparisonOperators;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JeuRepositoryCustom {
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<GameAvailableDTO> findAllByJeux() {
        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.project("titre")
                        .and(ArrayOperators.Size.lengthOfArray("exemplaires")).as("exemplairesTotal")
                        .and(
                                ArrayOperators.Size.lengthOfArray(
                                        ArrayOperators.Filter.filter("exemplaires")
                                                .as("exemplaire")
                                                .by(ComparisonOperators.Eq.valueOf("exemplaire.louable").equalToValue(true))

                                )
                        ).as("exemplairesDisponibles")
        );

        return mongoTemplate.aggregate(aggregation,"Jeux",GameAvailableDTO.class).getMappedResults();
    }
}

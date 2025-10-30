package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.bo.Jeu;
import fr.eni.ludotheque.dto.GameAvailableDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JeuRepository extends JpaRepository<Jeu,Integer> {
    @Query("""
    SELECT new fr.eni.ludotheque.dto.GameAvailableDTO(j.id, j.titre, COUNT(e))
    from Jeu j
    Join j.exemplaires e
    where e.louable = true
    group by j
""")
    List<GameAvailableDTO>findGamesWithAvailableCount();
}

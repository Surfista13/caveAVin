package fr.eni.caveavin.repository;

import fr.eni.caveavin.model.Bouteille;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BouteilleRepository extends JpaRepository<Bouteille, Integer> {
    List<Bouteille> findAllByOrderByNomAsc();
    List<Bouteille> findAllByOrderByNomDesc();
    List<Bouteille> findAllByOrderByCouleur_nomDesc();
}

package fr.eni.caveavin.repository;

import fr.eni.caveavin.model.Couleur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouleurRepository extends JpaRepository<Couleur,Integer> {
}

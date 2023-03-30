package fr.eni.caveavin.service;

import fr.eni.caveavin.model.Bouteille;

import java.util.List;
import java.util.Optional;

public interface BouteilleService {
    List<Bouteille> listerToutesLesBouteille();

    Optional<Bouteille> trouverUneBouteilleParSonId(int id);

    void sauvegarderUneBouteille(Bouteille bouteille);

    void effacerUneBouteille(Bouteille bouteille);
}

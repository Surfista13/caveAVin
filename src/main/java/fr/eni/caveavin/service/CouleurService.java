package fr.eni.caveavin.service;

import fr.eni.caveavin.model.Couleur;

import java.util.List;
import java.util.Optional;

public interface CouleurService {
    List<Couleur> listerToutesLesCouleurs();

    Optional<Couleur> trouverUneCouleurParSonId(int id);

    void ajouterUneCouleur(Couleur couleur);

    void effacturerUneCouleur(Couleur couleur);
}

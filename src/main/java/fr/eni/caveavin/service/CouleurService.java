package fr.eni.caveavin.service;

import fr.eni.caveavin.model.Couleur;
import fr.eni.caveavin.repository.CouleurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouleurService {
    @Autowired
    private CouleurRepository couleurRepository;

    public CouleurService() {

    }

    public List<Couleur> listerToutesLesCouleurs() {
        return couleurRepository.findAll();
    }
    public Couleur trouverUneCouleurParSonId(int id) {
        return couleurRepository.findById(id).get();
    }
    public void ajouterUneCouleur(Couleur couleur) {
        couleurRepository.save(couleur);
    }
    public void effacturerUneCouleur(Couleur couleur){
        couleurRepository.delete(couleur);
    }
}

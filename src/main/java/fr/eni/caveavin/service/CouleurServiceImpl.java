package fr.eni.caveavin.service;

import fr.eni.caveavin.model.Couleur;
import fr.eni.caveavin.repository.CouleurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CouleurServiceImpl implements CouleurService {
    @Autowired
    private CouleurRepository couleurRepository;

    @Override
    public List<Couleur> listerToutesLesCouleurs() {
        return couleurRepository.findAll();
    }
    @Override
    public Optional<Couleur> trouverUneCouleurParSonId(int id) {
        return couleurRepository.findById(id);
    }
    @Override
    public void ajouterUneCouleur(Couleur couleur) {
        couleurRepository.save(couleur);
    }
    @Override
    public void effacturerUneCouleur(Couleur couleur){
        couleurRepository.delete(couleur);
    }
}

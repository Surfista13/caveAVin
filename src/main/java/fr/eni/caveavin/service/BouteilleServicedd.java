package fr.eni.caveavin.service;

import fr.eni.caveavin.model.Bouteille;
import fr.eni.caveavin.repository.BouteilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BouteilleServicedd implements BouteilleService {
    @Autowired
    BouteilleRepository bouteilleRepository;

    @Override
    public List<Bouteille> listerToutesLesBouteille() {
        return bouteilleRepository.findAll();
    }
    @Override
    public Optional<Bouteille> trouverUneBouteilleParSonId(int id) {
        return bouteilleRepository.findById(id);
    }
    @Override
    public void sauvegarderUneBouteille(Bouteille bouteille) {
        bouteilleRepository.save(bouteille);
    }
    @Override
    public void effacerUneBouteille(Bouteille bouteille){
        bouteilleRepository.delete(bouteille);
    }
}

package fr.eni.caveavin.service;

import fr.eni.caveavin.model.Region;
import fr.eni.caveavin.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {
    @Autowired
    RegionRepository regionRepository;

    public List<Region> listerToutesLesRegions() {
        return regionRepository.findAll();
}
    public Region trouverUneRegionParSonId(int id) {
        return regionRepository.findById(id).get();
    }
    public void ajouterUneRegion(Region region) {
        regionRepository.save(region);
    }
    public void effacerUneRegion(Region region){
        regionRepository.delete(region);
    }
}

package fr.eni.caveavin.service;

import fr.eni.caveavin.model.Region;
import fr.eni.caveavin.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionServiceImpl implements RegionService {
    @Autowired
    RegionRepository regionRepository;

    @Override
    public List<Region> listerToutesLesRegions() {
        return regionRepository.findAll();
}
    @Override
    public Optional<Region> trouverUneRegionParSonId(int id) {
        return regionRepository.findById(id);
    }
    @Override
    public void ajouterUneRegion(Region region) {
        regionRepository.save(region);
    }
    @Override
    public void effacerUneRegion(Region region){
        regionRepository.delete(region);
    }
}

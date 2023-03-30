package fr.eni.caveavin.service;

import fr.eni.caveavin.model.Region;

import java.util.List;
import java.util.Optional;

public interface RegionService {
    List<Region> listerToutesLesRegions();

    Optional<Region> trouverUneRegionParSonId(int id);

    void ajouterUneRegion(Region region);

    void effacerUneRegion(Region region);
}

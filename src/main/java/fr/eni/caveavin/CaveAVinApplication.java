package fr.eni.caveavin;

import fr.eni.caveavin.model.Bouteille;
import fr.eni.caveavin.model.Couleur;
import fr.eni.caveavin.model.Region;
import fr.eni.caveavin.service.BouteilleServicedd;
import fr.eni.caveavin.service.CouleurService;
import fr.eni.caveavin.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CaveAVinApplication implements CommandLineRunner {
    @Autowired
    CouleurService couleurService;
    @Autowired
    RegionService regionService;
    @Autowired
    BouteilleServicedd bouteilleService;

    public static void main(String[] args) {
        SpringApplication.run(CaveAVinApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        Couleur couleur1 = new Couleur("Rouge");
//        Couleur couleur2 = new Couleur("Blanc");
//        Couleur couleur3 = new Couleur("Rosé");
//        Couleur couleur4 = new Couleur("Jaune");
//        couleurService.ajouterUneCouleur(couleur1);
//        couleurService.ajouterUneCouleur(couleur2);
//        couleurService.ajouterUneCouleur(couleur3);
//        couleurService.ajouterUneCouleur(couleur4);
//
//        Region region1 = new Region("Loire");
//        Region region2 = new Region("Bordeaux");
//        Region region3 = new Region("Bourgogne");
//        Region region4 = new Region("Côtes du Rhone");
//        regionService.ajouterUneRegion(region1);
//        regionService.ajouterUneRegion(region2);
//        regionService.ajouterUneRegion(region3);
//        regionService.ajouterUneRegion(region4);
//
//        Bouteille bouteille1 = new Bouteille("Chablis",false,"1997",15,couleur1, region1);
//        Bouteille bouteille2 = new Bouteille("Menetou Salon",false,"1988",10,couleur2, region2);
//        Bouteille bouteille3 = new Bouteille("Pessac Leognan",false,"1980",20,couleur3, region4);
//        bouteilleService.sauvegarderUneBouteille(bouteille1);
//        bouteilleService.sauvegarderUneBouteille(bouteille2);
//        bouteilleService.sauvegarderUneBouteille(bouteille3);


    }
}

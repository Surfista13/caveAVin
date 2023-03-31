package fr.eni.caveavin.controller;

import fr.eni.caveavin.model.Bouteille;
import fr.eni.caveavin.service.BouteilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BouteilleController {

    @Autowired
    BouteilleService bouteilleService;

    @GetMapping("/bouteilles")
    public List<Bouteille> getBouteilles() {
        return bouteilleService.listerToutesLesBouteille();
    }

    @GetMapping("/bouteilles/{id}")
    public ResponseEntity<Bouteille> getBouteille(@PathVariable Integer id) {
        Bouteille bouteille = bouteilleService.trouverUneBouteilleParSonId(id).orElse(null);
        if (bouteille == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(bouteille, HttpStatus.OK);
    }


    @PostMapping("/bouteilles/ajouter")
    public ResponseEntity<Bouteille> ajouterBouteille(@RequestBody Bouteille bouteille) {
        ResponseEntity<Bouteille> response;
        try {
            if(bouteille == null) {
                response = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            bouteilleService.sauvegarderUneBouteille(bouteille);
            response = new ResponseEntity<>(bouteille,HttpStatus.CREATED);
        } catch (Exception e) {
            response = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return response;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Bouteille> supprimerBouteille(@PathVariable Integer id) {
        ResponseEntity<Bouteille> response;
        Bouteille bouteilleAEffacer = bouteilleService.trouverUneBouteilleParSonId(id).orElse(null);
        try {
            bouteilleService.effacerUneBouteille(bouteilleAEffacer);
            response = new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (Exception e) {
            response = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return response;
    }




}

package fr.eni.caveavin.controller;

import fr.eni.caveavin.model.Bouteille;
import fr.eni.caveavin.service.BouteilleService;
import fr.eni.caveavin.service.BouteilleServicedd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bouteille")
public class BouteilleController {

    @Autowired
    BouteilleService bouteilleService;

    @GetMapping
    public List<Bouteille> getBouteilles() {
        return bouteilleService.listerToutesLesBouteille();
    }

}

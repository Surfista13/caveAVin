package fr.eni.caveavin.controller;

import fr.eni.caveavin.model.Couleur;
import fr.eni.caveavin.service.CouleurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CouleurController {

    @Autowired
    CouleurService couleurService;

    @GetMapping("/couleurs")
    public List<Couleur> getCouleurs() {
        return couleurService.listerToutesLesCouleurs();
    }
}

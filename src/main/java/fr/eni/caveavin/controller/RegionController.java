package fr.eni.caveavin.controller;

import fr.eni.caveavin.model.Region;
import fr.eni.caveavin.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RegionController {
    @Autowired
    RegionService regionService;

    @GetMapping("/regions")
    public List<Region> getRegions() {
        return regionService.listerToutesLesRegions();
}


}

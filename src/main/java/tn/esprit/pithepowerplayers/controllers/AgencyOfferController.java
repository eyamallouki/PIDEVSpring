package tn.esprit.pithepowerplayers.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tn.esprit.pithepowerplayers.entities.AgencyOffer;
import tn.esprit.pithepowerplayers.entities.AgencyOfferType;
import tn.esprit.pithepowerplayers.generic.GenericController;
import tn.esprit.pithepowerplayers.services.IAgencyOfferService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("/*")
@AllArgsConstructor
@RequestMapping("/Offer")
public class AgencyOfferController extends GenericController<AgencyOffer,Integer> {

    private final IAgencyOfferService iAgencyofferService;

    @PostMapping("/assUser/{id_AgencyOffer}/{id_User}")
    public AgencyOffer AssignAgencToOff(@PathVariable Integer id_AgencyOffer, @PathVariable Integer id_User) {
        return iAgencyofferService.AssignAgencToOff(id_AgencyOffer, id_User);
    }


    @PostMapping("/assOfferType/{id_AgencyOffer}/{agencyOfferType}")
    public AgencyOffer assignAgencyOfferToAgencyOfferType(@PathVariable Integer id_AgencyOffer, @PathVariable AgencyOfferType agencyOfferType) {
        return iAgencyofferService.assignAgencyOfferToAgencyOfferType(id_AgencyOffer, agencyOfferType);
    }

    @GetMapping("/count/{agencyOfferType}")
    public Integer getOfferCountByType(@PathVariable AgencyOfferType agencyOfferType) {
        return iAgencyofferService.getOfferCountByType(agencyOfferType);
    }

    @PostMapping("/AssignAgencyOfferToCodePromo/{id_AgencyOffer}/{id_code}")
    public AgencyOffer AssignAgencyOfferToCodePromo(@PathVariable Integer id_AgencyOffer, @PathVariable Integer id_code) {
        return iAgencyofferService.AssignAgencyOfferToCodePromo(id_AgencyOffer, id_code);
    }

    @GetMapping("/byLocation")
    public ResponseEntity<Map<String, Object>> getAgencyOffersByLocation(@RequestParam("location") String location) {
        List<AgencyOffer> agencyOffers = iAgencyofferService.getAgencyOffersByLocation(location);
        Integer count = iAgencyofferService.getCountAgencyOffersByLocation(location);
        Map<String, Object> response = new HashMap<>();
        response.put("offers", agencyOffers);
        response.put("count", count);
        return ResponseEntity.ok().body(response);
    }

}


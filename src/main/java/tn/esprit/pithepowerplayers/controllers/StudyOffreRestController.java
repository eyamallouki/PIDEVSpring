package tn.esprit.pithepowerplayers.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.pithepowerplayers.entities.StudyOffer;
import tn.esprit.pithepowerplayers.generic.GenericController;
import tn.esprit.pithepowerplayers.services.IStudyOfferService;
import tn.esprit.pithepowerplayers.services.IUniversiteService;


@RestController
@AllArgsConstructor
@RequestMapping("/StudyOffre")
public class StudyOffreRestController extends GenericController<StudyOffer,Integer> {
    private final IStudyOfferService StudyOffreService;

}
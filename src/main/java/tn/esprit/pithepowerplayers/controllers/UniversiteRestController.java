package tn.esprit.pithepowerplayers.controllers;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pithepowerplayers.entities.User;
import tn.esprit.pithepowerplayers.generic.GenericController;
import tn.esprit.pithepowerplayers.services.IUniversiteService;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;


@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController extends GenericController<User,Integer> {

    private final IUniversiteService universiteService;


    @PutMapping("/{idUser}/{idStudyOffer}")
    public void assignUniversiteToStudyOffer(@PathVariable Integer idUser,
                                              @PathVariable Integer idStudyOffer){
         universiteService.assignUniversiteToStudyOffers(idUser,idStudyOffer);
    }



}



package tn.esprit.pithepowerplayers.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import tn.esprit.pithepowerplayers.entities.Department;
import tn.esprit.pithepowerplayers.entities.StudyOffer;
import tn.esprit.pithepowerplayers.entities.User;
import tn.esprit.pithepowerplayers.generic.IGenericServiceImp;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Slf4j
@AllArgsConstructor
public class IUniversiteServiceImpl implements IUniversiteService{


    private final IDepartementServiceImpl departementService;
    private final IStudyOfferServiceImpl StudyOfferService;
    private final UserServiceImp  userService;
    @Override
    public void assignUniversiteToStudyOffers(Integer idUser, Integer idStudyOffers) {
        User universite = userService.retrieveById(idUser);
        StudyOffer studyOffer = StudyOfferService.retrieveById(idStudyOffers);
        if (universite!= null && studyOffer !=null){
            universite.getStudyOffers().add(studyOffer);
        }
    }

    @Override
    public List<StudyOffer> retrievestudyOfferByUniversite(Integer idUser) {
        User universite = userService.retrieveById(idUser);
        return universite!=null ? universite.getStudyOffers(): null;
    }











}

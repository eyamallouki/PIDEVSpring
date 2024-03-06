package tn.esprit.pithepowerplayers.services;




import tn.esprit.pithepowerplayers.entities.Department;
import tn.esprit.pithepowerplayers.entities.StudyOffer;
import tn.esprit.pithepowerplayers.entities.User;
import tn.esprit.pithepowerplayers.generic.IGenericService;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface IUniversiteService  {

    void assignUniversiteToStudyOffers(Integer idUser, Integer idStudyOffer);

    List<StudyOffer> retrievestudyOfferByUniversite(Integer idUser);






}

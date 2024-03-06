package tn.esprit.pithepowerplayers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pithepowerplayers.entities.AgencyOffer;
import tn.esprit.pithepowerplayers.entities.AgencyOfferType;

import java.util.List;

public interface AgencyOfferRepository extends JpaRepository<AgencyOffer,Integer> {
    AgencyOffer findByAgencyOfferType(AgencyOfferType agencyOfferType);
    //keywords : une fonction traja3 nbr des offres selons el type mte3hom : bch nest3mlou count by Offertype
    Integer countByAgencyOfferType(AgencyOfferType agencyOfferType);
    List<AgencyOffer> findByLocation(String location);
    Integer countByLocation(String location);}
package tn.esprit.pithepowerplayers.services;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

import com.twilio.type.PhoneNumber;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import tn.esprit.pithepowerplayers.entities.AgencyOffer;
import tn.esprit.pithepowerplayers.entities.AgencyOfferType;
import tn.esprit.pithepowerplayers.entities.CodePromo;
import tn.esprit.pithepowerplayers.entities.User;
import tn.esprit.pithepowerplayers.generic.IGenericServiceImp;
import tn.esprit.pithepowerplayers.repositories.AgencyOfferRepository;
import tn.esprit.pithepowerplayers.repositories.CodePromoRepository;
import tn.esprit.pithepowerplayers.repositories.ReservationRepository;
import tn.esprit.pithepowerplayers.repositories.UserRepository;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IAgencyOfferServiceImp extends IGenericServiceImp<AgencyOffer,Integer> implements IAgencyOfferService {
    private final ReservationRepository reservationRepository ;
    private  final AgencyOfferRepository agencyOfferRepository ;
    private final UserRepository userRepository;

    private  final CodePromoRepository codePromoRepository ;

    @Override
    public AgencyOffer AssignAgencToOff(Integer id_AgencyOffer, Integer id_User) {
        User TravelAgency= userRepository.findById(id_User).orElse(null);
        AgencyOffer agencyOffer=agencyOfferRepository.findById(id_AgencyOffer).orElse(null);
        if(TravelAgency!=null && agencyOffer!=null){
            agencyOffer.setTravelagency(TravelAgency);
        }
        return  agencyOfferRepository.save(agencyOffer);
    }
    @Override
    public AgencyOffer assignAgencyOfferToAgencyOfferType(Integer id_AgencyOffer, AgencyOfferType agencyOfferType) {
        AgencyOffer agencyOffer = agencyOfferRepository.findById(id_AgencyOffer).orElse(null);
        agencyOffer.setAgencyOfferType(agencyOfferType);
        return agencyOfferRepository.save(agencyOffer);

    }

    @Override
    public Integer getOfferCountByType(AgencyOfferType agencyOfferType) {
        return agencyOfferRepository.countByAgencyOfferType(agencyOfferType);
    }

    @Override
    public List<AgencyOffer> getAgencyOffersByLocation(String location) {
        List<AgencyOffer> agencyOffers = agencyOfferRepository.findByLocation(location);
        return agencyOffers;
    }

    @Override
    public Integer getCountAgencyOffersByLocation(String location) {
        Integer count = agencyOfferRepository.countByLocation(location);
        return count;
    }


    @Override
    public AgencyOffer AssignAgencyOfferToCodePromo(Integer id_AgencyOffer, Integer id_code) {

        AgencyOffer agencyOffer = agencyOfferRepository.findById(id_AgencyOffer).orElse(null);
        CodePromo codePromo = codePromoRepository.findById(id_code).orElse(null);
        if (agencyOffer != null && codePromo != null) {
            if (codePromo.getExpirationDate().isBefore(LocalDate.now())) {
                return null;
            }
            agencyOffer.setCodePromo(codePromo);
            Twilio.init("AC6da0b69d2bf9e1898ab0bb4a65a81a9f", "8318d74e59fd752e632ca343a83a5bbb");
            Message message = Message.creator(
                    new PhoneNumber("+21623100026"),
                    new PhoneNumber("15674234482"),
                    "Bonjour\uD83E\uDD73 vous venez de recevoir une nouvelle code promo pour l'offre " + agencyOffer.getAgencyName() + ". Utilisez le code " + codePromo.getCode()).create();
            return agencyOfferRepository.save(agencyOffer);

        }
        return null;
    }


    @Override
    public void appliquerReductionOffre(Integer  id_AgencyOffer, Float reduction) {
        // Récupérer l'offre correspondant à l'identifiant idOffre
        AgencyOffer agencyOffer = agencyOfferRepository.findById(id_AgencyOffer).orElse(null);

        if (agencyOffer!=null) {
            // Appliquer la réduction à l'offre
            Float prixInitial = agencyOffer.getPrice();
            Float nouveauPrix = prixInitial * (1 - reduction);
            // setina el prix jdyd lel AgencyOffer deja recuperé
            agencyOffer.setPrice(nouveauPrix);
            // Mettre à jour l'offre dans la base de données
            agencyOfferRepository.save(agencyOffer);
        } else {
            //kn l 'dentifiant taa agence y9olk non trouvé o matnjmech t'applici reduction ala offer heka
            throw new IllegalArgumentException("Offre avec l'identifiant " +id_AgencyOffer + " non trouvée");
        }
    }

}

package tn.esprit.pithepowerplayers.services;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import tn.esprit.pithepowerplayers.SMS.SmsPojo;
import tn.esprit.pithepowerplayers.SMS.SmsService;
import tn.esprit.pithepowerplayers.entities.*;
import tn.esprit.pithepowerplayers.generic.IGenericServiceImp;
import tn.esprit.pithepowerplayers.repositories.AgencyOfferRepository;
import tn.esprit.pithepowerplayers.repositories.CodePromoRepository;
import tn.esprit.pithepowerplayers.repositories.ReservationRepository;
import tn.esprit.pithepowerplayers.repositories.UserRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IReservationServiceImp extends IGenericServiceImp<Reservation,Integer> implements IReservationService {
    private final ReservationRepository reservationRepository;
    private final AgencyOfferRepository agencyOfferRepository;

    private  final CodePromoRepository codePromoRepository ;

    private final IAgencyOfferService agencyOfferService;


    private  final UserRepository userRepository ;
    private final SmsService smsService;

    //Assigne and desincrementé capacity taa offre
    @Override
    @Transactional
    public Reservation assignReservationToOffer(Integer id_Reservation, Integer id_AgencyOffer) {

        Reservation reservation = reservationRepository.findById(id_Reservation).orElse(null);
        AgencyOffer agencyOffer = agencyOfferRepository.findById(id_AgencyOffer).orElse(null);

        if (reservation != null && agencyOffer != null) {
            reservation.setAgencyOffer(agencyOffer);
            agencyOffer.decrementCapacity();
            reservation.setAmnout(agencyOffer.getPrice()); // On affecte le prix de l'offre au montant de la réservation
            reservationRepository.save(reservation);
            agencyOfferRepository.save(agencyOffer);
            return reservation;
        }
        return null;
    }



    //Fonction eli tfasa5 el reservation eli statu mte3ha refusé
    @Scheduled(cron = "0 0 17 * * *")
    public void SupprimerLesReservationRefusé() {
        // récupérer toutes les réservations avec le statut "Refused"
        List<Reservation> refusedReservations = reservationRepository.findByStatus(StatusReservation.Refused);
        // supprimer les réservations
        reservationRepository.deleteAll(refusedReservations);
    }

    //Fonction mta3 el discount
    @Override
    public List<Object[]> getReservationsDuringBlackFriday() throws ParseException {
        Date fd = new SimpleDateFormat("dd-MM-yyyy").parse("23-11-2023");
        Date ld = new SimpleDateFormat("dd-MM-yyyy").parse("27-11-2023");
        List<Reservation> reservations = reservationRepository.findReservationsBetweenDates(fd, ld);
        List<Object[]> result = new ArrayList<>();
        for (Reservation reservation : reservations) {
            String message = "Vous avez effectué une réservation pendant le Black Friday donc vous allez profiter d'une réduction de 20%";
            String message2 = "voici le prix avant reduction ";
            Float originalAmount = reservation.getAmnout();
            String message3 = "voici le prix aprés reduction ";
            Float discountedAmount = originalAmount * 0.8f; // 20% discount

            reservation.setAmnout(discountedAmount); // update ta3  amount f reservation
            reservationRepository.save(reservation); // save the updated reservation in the database
            Object[] reservationData = {reservation, message, message2, originalAmount, message3, discountedAmount};
            result.add(reservationData);
        }
        return result;
    }

    @Override
    public void appliquerReductionReservation(Integer id_reservation, Float reduction) {

    }


}


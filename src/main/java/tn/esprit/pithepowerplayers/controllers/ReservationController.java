package tn.esprit.pithepowerplayers.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pithepowerplayers.entities.AgencyOffer;
import tn.esprit.pithepowerplayers.entities.CodePromo;
import tn.esprit.pithepowerplayers.entities.Reservation;
import tn.esprit.pithepowerplayers.generic.GenericController;
import tn.esprit.pithepowerplayers.repositories.ReservationRepository;
import tn.esprit.pithepowerplayers.services.ICodePromoService;
import tn.esprit.pithepowerplayers.services.IReservationService;

import java.text.ParseException;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Reservation")
public class ReservationController extends GenericController<Reservation,Integer> {
    private final IReservationService iReservationService;
    private final ICodePromoService iCodePromoService;

    private final ReservationRepository reservationRepository;

    @PostMapping("/assignResToOff/{id_Reservation}/{id_AgencyOffer}")
    public Reservation assignReservationToOffer(@PathVariable Integer id_Reservation, @PathVariable Integer id_AgencyOffer) {
        return iReservationService.assignReservationToOffer(id_Reservation, id_AgencyOffer);
    }


    @GetMapping("/bF")
    public List<Object[]> getReservationsDuringBlackFriday() throws ParseException {
        return iReservationService.getReservationsDuringBlackFriday();
    }


}

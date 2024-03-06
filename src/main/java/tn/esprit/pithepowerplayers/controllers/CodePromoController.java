package tn.esprit.pithepowerplayers.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pithepowerplayers.entities.CodePromo;
import tn.esprit.pithepowerplayers.entities.Comment;
import tn.esprit.pithepowerplayers.entities.Reservation;
import tn.esprit.pithepowerplayers.generic.GenericController;
import tn.esprit.pithepowerplayers.repositories.ReservationRepository;
import tn.esprit.pithepowerplayers.services.IAgencyOfferService;
import tn.esprit.pithepowerplayers.services.ICodePromoService;
import tn.esprit.pithepowerplayers.services.IReservationService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/CodePromo")
public class CodePromoController extends GenericController<CodePromo,Integer> {
    private final ICodePromoService iCodePromoService ;
    private  final IAgencyOfferService iAgencyOfferService ;

    private  final IReservationService iReservationService;

    private  final ReservationRepository reservationRepository;

    @PostMapping("/valideCode/{id_AgencyOffer}/code")
    public ResponseEntity<String> validerCodePromo(@PathVariable("id_AgencyOffer") Integer id_AgencyOffer, @RequestParam("code") String code) {

        CodePromo codePromo = iCodePromoService.validerCodePromo(code);
        if (codePromo == null) {
            return ResponseEntity.badRequest().body("Code promo invalide ou expiré");
        }
        iAgencyOfferService.appliquerReductionOffre(id_AgencyOffer,  codePromo.getReduction());
        iCodePromoService.decrementerNombreUtilisations(codePromo);
        return ResponseEntity.ok("Réduction appliquée avec succès");
    }





}

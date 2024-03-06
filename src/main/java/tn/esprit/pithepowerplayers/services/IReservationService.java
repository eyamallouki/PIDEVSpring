package tn.esprit.pithepowerplayers.services;

import tn.esprit.pithepowerplayers.entities.Reservation;
import tn.esprit.pithepowerplayers.generic.IGenericService;

import java.text.ParseException;
import java.util.List;

public interface IReservationService extends IGenericService<Reservation,Integer> {
    public Reservation assignReservationToOffer(Integer id_Reservation ,Integer id_AgencyOffer);
    public List<Object[]> getReservationsDuringBlackFriday() throws ParseException;

    public void appliquerReductionReservation(Integer id_reservation, Float reduction);

}

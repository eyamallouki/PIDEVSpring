package tn.esprit.pithepowerplayers.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter

@AllArgsConstructor
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Reservation;
    private Float amnout;
    @Temporal(TemporalType.DATE)
    private Date date_Reservation;


    @Enumerated(EnumType.STRING)
    private StatusReservation statusReservation;
    public Reservation() {
        this.statusReservation = StatusReservation.UnderTreatment;
    }

    @JsonIgnore
    @ManyToOne
    private AgencyOffer agencyOffer;
    @ManyToOne
    private User student;
    @ManyToOne
    private CodePromo codePromo;

}

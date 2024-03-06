package tn.esprit.pithepowerplayers.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AgencyOffer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_AgencyOffer;
    private  String AgencyName;
    private Float Price;
    private String Description;
    @Enumerated(EnumType.STRING)
    private AgencyOfferType agencyOfferType;
    private String image;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;
    private Integer capacity;
    private String location ;


    @Transactional
    public void decrementCapacity() {
        if (this.capacity > 0) {
            this.capacity--;
        } else {
            throw new RuntimeException("Capacity is already at its minimum value.");
        }
    }

    @OneToMany(mappedBy = "agencyOffer")
    private List<Reservation> reservations;
    @JsonIgnore
    @ManyToOne
    private User travelagency;

    @ManyToOne
    private CodePromo codePromo;
}

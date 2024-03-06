package tn.esprit.pithepowerplayers.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudyOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_studyOffer;

    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private StudyOfferType studyOfferType;

    private boolean studentGrant;

    private float studentGrantAmount;
    private int max_Application;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date deadline;

    @ManyToOne
    private User university;

    @OneToMany(mappedBy = "studyOffer")
    private List<Application> applications;

    @ManyToOne
    private Option option;

}

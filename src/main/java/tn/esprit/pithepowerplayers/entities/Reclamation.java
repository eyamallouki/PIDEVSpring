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
@NoArgsConstructor
@AllArgsConstructor
public class Reclamation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Reclamation;
    @Temporal(TemporalType.DATE)
    private Date dateReclamation;
    private String title;
    private String Description ;
    private String image;
    @Enumerated(EnumType.STRING)
    private ReclamationStatus reclamationStatus;
    @Temporal(TemporalType.DATE)
    private Date processedDate;

    @ManyToOne
    @JsonIgnore
    private User user;

}

package tn.esprit.pithepowerplayers.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Option;

    private String name;

    @ManyToOne
    private Department department;

    @OneToMany(mappedBy = "option")
    private List<StudyOffer> studyOffers;


}

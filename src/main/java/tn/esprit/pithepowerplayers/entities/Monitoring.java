package tn.esprit.pithepowerplayers.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Monitoring {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_monitoring;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Enumerated(EnumType.STRING)
    private TypeMonitoring typeMonitoring;

    private  String title;

    private String Description;

    @ManyToOne
    private User coach;

    @ManyToOne(cascade =CascadeType.ALL)
    private User student;


}

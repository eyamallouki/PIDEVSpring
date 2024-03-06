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
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Application;
    private String cv;
    private String Frensh_Level;
    private String English_Level;
    private String MotivationLetter;
    @Temporal(TemporalType.DATE)
    private Date applicationDate;
    @Enumerated(EnumType.STRING)
    private ApplicationStatus applicationStatus;
    private String description;
    private String  statementOfGrades;
    private String certificateOfAchievement;
    private float gradeMainModule1;
    private float gradeMainModule2;



    @ManyToOne
    private StudyOffer studyOffer;

    @ManyToOne
    private  User student;


    @ManyToOne
    private User moderator;


}

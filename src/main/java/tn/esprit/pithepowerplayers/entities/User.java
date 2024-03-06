package tn.esprit.pithepowerplayers.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_User;
    private String email_Address;
    private String login;
    private String password;
    private String confirmPassword;
    private String userName;
    private String image;
    private String adress;
    private String contact;
    private Integer phone_number;
    private String country;
    private String city;
    private String description;
    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String nationnlity;
    private boolean isStudentSelected;
    private Integer cin;

    @ManyToOne
    private LikeP  likeP;
    @ManyToOne
    private Dislike dislike;
    @ManyToOne
    @JsonIgnore
    private Role role;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Reclamation> reclamations;

    @OneToMany( mappedBy = "user")
    @JsonIgnore
    private List<PostBlog> postBlogs;

    @OneToMany
    @JsonIgnore
    private List<Comment> comment;

    @OneToMany(mappedBy = "university")
    private  List<StudyOffer> studyOffers;

    @OneToMany(mappedBy = "coach")
    private List<Monitoring> coachmonitorings;

    @OneToMany(mappedBy = "travelagency")
    private List<AgencyOffer> agencyOffers;

    @OneToMany
    private List<UnderComment> underComments;

    @OneToMany(mappedBy = "student")
    private List<Application> studentapplications;

    @OneToMany(mappedBy = "student")
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "moderator")
    private List<Application> moderatorapplications;
     @JsonIgnore
    @OneToMany(mappedBy= "student")
    private List<Monitoring> studentMonitorings;
}

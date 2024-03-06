package tn.esprit.pithepowerplayers.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Message  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Message;
    private String text;
    private LocalDate timestamp; //conversion bd

    private Boolean wasRead;

    @ManyToOne(cascade = CascadeType.ALL)
    private User from;

    @ManyToOne(cascade = CascadeType.ALL)
    private User to;

    @ManyToOne(cascade = CascadeType.ALL)
    private ChatRoom chatRoom;




}

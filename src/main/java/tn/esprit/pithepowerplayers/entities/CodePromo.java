package tn.esprit.pithepowerplayers.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class CodePromo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_code;
    private String code;
    private Float reduction;
    private LocalDate ExpirationDate;
    private  Boolean Expire;
    private  Integer NumberOfUsing;



}


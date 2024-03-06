package tn.esprit.pithepowerplayers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.pithepowerplayers.entities.AgencyOffer;
import tn.esprit.pithepowerplayers.entities.CodePromo;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface CodePromoRepository extends JpaRepository<CodePromo, Integer>  {

   //  List<CodePromo> findCodePromoByCode(String code);

     CodePromo findCodePromoByCode(String code);

     @Query("SELECT cp FROM CodePromo cp WHERE cp.ExpirationDate < :date")
     List<CodePromo> findByExpirationDateBefore(@Param("date") LocalDate date);




}
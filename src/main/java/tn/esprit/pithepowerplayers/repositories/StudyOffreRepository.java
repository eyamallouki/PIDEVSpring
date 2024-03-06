package tn.esprit.pithepowerplayers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.pithepowerplayers.entities.StudyOffer;


import java.util.List;

public interface StudyOffreRepository extends JpaRepository<StudyOffer,Integer> {




}

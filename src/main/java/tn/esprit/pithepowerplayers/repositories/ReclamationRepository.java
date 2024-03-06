package tn.esprit.pithepowerplayers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pithepowerplayers.entities.Reclamation;

public interface ReclamationRepository extends JpaRepository<Reclamation, Integer> {
}
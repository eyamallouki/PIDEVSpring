package tn.esprit.pithepowerplayers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pithepowerplayers.entities.Message;
import tn.esprit.pithepowerplayers.entities.Monitoring;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}

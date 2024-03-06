package tn.esprit.pithepowerplayers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pithepowerplayers.entities.ChatRoom;


public interface ChatRepository extends JpaRepository<ChatRoom, Integer> {
}

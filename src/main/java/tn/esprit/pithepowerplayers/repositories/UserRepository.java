package tn.esprit.pithepowerplayers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pithepowerplayers.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}

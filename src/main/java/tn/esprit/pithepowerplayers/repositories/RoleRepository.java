package tn.esprit.pithepowerplayers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pithepowerplayers.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}

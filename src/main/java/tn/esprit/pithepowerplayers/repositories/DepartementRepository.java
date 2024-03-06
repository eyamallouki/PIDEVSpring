package tn.esprit.pithepowerplayers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.pithepowerplayers.entities.Department;


import java.util.List;

public interface DepartementRepository extends JpaRepository<Department,Integer> {




}

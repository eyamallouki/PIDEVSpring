package tn.esprit.pithepowerplayers.repositories;

import javafx.scene.effect.Lighting;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pithepowerplayers.entities.Monitoring;
import tn.esprit.pithepowerplayers.entities.User;

import java.util.List;

public interface MonitoringRepository extends JpaRepository<Monitoring, Integer> {
    public int countMonitoringByStudent(User user);
    public List<Monitoring> getMonitoringsByStudent(User user);
    public List<Monitoring> findMonitoringsByOrderByStartDate();
}

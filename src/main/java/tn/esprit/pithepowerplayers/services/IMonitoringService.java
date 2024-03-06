package tn.esprit.pithepowerplayers.services;

import tn.esprit.pithepowerplayers.entities.ChatRoom;
import tn.esprit.pithepowerplayers.entities.Monitoring;
import tn.esprit.pithepowerplayers.entities.User;
import tn.esprit.pithepowerplayers.generic.IGenericService;

import java.util.List;

public interface IMonitoringService extends IGenericService<Monitoring,Integer> {
    public Monitoring affectMonitoringtostudent(Integer user_id,Integer id_monitoring);
    public int nbbystudent(User user);
    public List<Monitoring>getMontoringsByStudent(User user);
    public List<Monitoring> getMontorinigsorderbydate();
}

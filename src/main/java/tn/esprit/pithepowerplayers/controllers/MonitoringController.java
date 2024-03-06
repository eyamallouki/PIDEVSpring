package tn.esprit.pithepowerplayers.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pithepowerplayers.entities.Message;
import tn.esprit.pithepowerplayers.entities.Monitoring;
import tn.esprit.pithepowerplayers.entities.User;
import tn.esprit.pithepowerplayers.generic.GenericController;
import tn.esprit.pithepowerplayers.services.IMonitoringService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/monitoring")
public class MonitoringController extends GenericController<Monitoring,Integer> {
    private final IMonitoringService serviceMonitoring;

    @PostMapping("{user_id}/{id_monitoring}")
    public Monitoring affectMonitoringtostudent(@PathVariable Integer user_id, @PathVariable Integer id_monitoring){
        return  serviceMonitoring.affectMonitoringtostudent(user_id, id_monitoring);
    }

    @GetMapping("get/{user}")
    public int nbbystudent(@PathVariable User user){
        return  serviceMonitoring.nbbystudent(user);
    }

    @GetMapping("getmontorings/{user1}")
    public List<Monitoring> getMontoringsByStudent(@PathVariable User user1){
        return  serviceMonitoring.getMontoringsByStudent(user1);
    }

    @GetMapping("getmonitorings/orderbydate")
    public List<Monitoring> getMontorinigsorderbydate(){
        return  serviceMonitoring.getMontorinigsorderbydate();
    }
}

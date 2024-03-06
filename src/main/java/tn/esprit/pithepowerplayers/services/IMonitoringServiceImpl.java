package tn.esprit.pithepowerplayers.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pithepowerplayers.entities.ChatRoom;
import tn.esprit.pithepowerplayers.entities.Monitoring;
import tn.esprit.pithepowerplayers.entities.RoleType;
import tn.esprit.pithepowerplayers.entities.User;
import tn.esprit.pithepowerplayers.generic.IGenericServiceImp;
import tn.esprit.pithepowerplayers.repositories.MonitoringRepository;
import tn.esprit.pithepowerplayers.repositories.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IMonitoringServiceImpl extends IGenericServiceImp<Monitoring,Integer> implements IMonitoringService{
    private final MonitoringRepository monitoringrepository;
    private final UserRepository userrepository;

    @Override
    public Monitoring affectMonitoringtostudent(Integer user_id,Integer id_monitoring) {
        Monitoring monitoring=monitoringrepository.findById(id_monitoring).orElse(null);
        User user=userrepository.findById(user_id).orElse(null);
        if(monitoring!=null && user!=null && user.isStudentSelected()){
            monitoring.setStudent(user);
            monitoringrepository.save(monitoring);
        }
        return null;
    }

    @Override
    public int nbbystudent(User user) {
        if(user.getRole().getRoleType()== RoleType.Student){
            return monitoringrepository.countMonitoringByStudent(user);
        }
        return 0;}

    @Override
    public List<Monitoring> getMontoringsByStudent(User user) {
        if(user.getRole().getRoleType()==RoleType.Student && user.isStudentSelected()){
        return monitoringrepository.getMonitoringsByStudent(user);
    }
return null;
    }

    @Override
    public List<Monitoring> getMontorinigsorderbydate() {
        return monitoringrepository.findMonitoringsByOrderByStartDate();
    }


}

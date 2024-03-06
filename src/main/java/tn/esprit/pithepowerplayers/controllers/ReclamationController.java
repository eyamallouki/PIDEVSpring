package tn.esprit.pithepowerplayers.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pithepowerplayers.entities.Reclamation;
import tn.esprit.pithepowerplayers.generic.GenericController;
import tn.esprit.pithepowerplayers.services.IReclamationService;

@RestController
@AllArgsConstructor
@RequestMapping("/Reclamation")
public class ReclamationController extends GenericController<Reclamation,Integer> {
    private final IReclamationService iReclamationService;
    @PutMapping("/AddAndAssignReclamationToStudentParMail/{id_User}")
    public Reclamation AddAndAssignReclamationToStudentParMail(@PathVariable Integer id_User,
                                                               @RequestBody Reclamation reclamation )throws Exception{
        return iReclamationService.AddAndAssignReclamationToStudentParMail(id_User, reclamation);
    }
}

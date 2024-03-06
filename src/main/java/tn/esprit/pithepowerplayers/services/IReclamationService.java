package tn.esprit.pithepowerplayers.services;

import tn.esprit.pithepowerplayers.entities.Reclamation;
import tn.esprit.pithepowerplayers.generic.IGenericService;

public interface IReclamationService extends IGenericService<Reclamation,Integer> {
    Reclamation AddAndAssignReclamationToStudentParMail (Integer id_User, Reclamation reclamation) throws Exception;

}


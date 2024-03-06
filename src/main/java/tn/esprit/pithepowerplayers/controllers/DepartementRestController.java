package tn.esprit.pithepowerplayers.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pithepowerplayers.entities.Department;
import tn.esprit.pithepowerplayers.generic.GenericController;
import tn.esprit.pithepowerplayers.services.IDepartementService;


@RestController
@AllArgsConstructor
@RequestMapping("/departement")
public class DepartementRestController extends GenericController<Department,Integer> {
    private final IDepartementService DepartmentService;
}



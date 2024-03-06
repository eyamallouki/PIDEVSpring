package tn.esprit.pithepowerplayers.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pithepowerplayers.entities.Role;
import tn.esprit.pithepowerplayers.generic.GenericController;
import tn.esprit.pithepowerplayers.services.IRoleService;

@RestController
@AllArgsConstructor
@RequestMapping("/role")
public class RoleController extends GenericController <Role , Integer >{
    private final IRoleService roleService ;
    @PostMapping("/assigUR/{id_Role}/{id_User}")
    public void assignRoleToUSer (@PathVariable Integer id_Role,
                                  @PathVariable Integer id_User){
        roleService.assignRoleToUser(id_Role, id_User);
    }
}


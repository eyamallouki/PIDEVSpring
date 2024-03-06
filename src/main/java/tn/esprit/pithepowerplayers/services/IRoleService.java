package tn.esprit.pithepowerplayers.services;

import tn.esprit.pithepowerplayers.entities.Role;
import tn.esprit.pithepowerplayers.entities.User;
import tn.esprit.pithepowerplayers.generic.IGenericService;

public interface IRoleService extends IGenericService<Role,Integer> {
    public void assignRoleToUser(Integer id_User, Integer id_Role) ;

}

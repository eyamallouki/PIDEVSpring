package tn.esprit.pithepowerplayers.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pithepowerplayers.entities.Role;
import tn.esprit.pithepowerplayers.entities.User;
import tn.esprit.pithepowerplayers.generic.IGenericServiceImp;
import tn.esprit.pithepowerplayers.repositories.RoleRepository;
import tn.esprit.pithepowerplayers.repositories.UserRepository;

@Service
@RequiredArgsConstructor
public class RoleServiceImp extends IGenericServiceImp<Role,Integer> implements IRoleService {
    private final RoleRepository roleRepository;
    private final UserRepository userRepository;

    @Override
    public void assignRoleToUser(Integer id_User, Integer id_Role) {
        User user = userRepository.findById(id_User).orElse(null);

        Role role = this.retrieveById(id_Role) ;
        if(user!=null && role!=null){
            user.setRole(role);
            userRepository.save(user);
        }

    }
}
package tn.esprit.pithepowerplayers.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pithepowerplayers.entities.User;
import tn.esprit.pithepowerplayers.generic.IGenericServiceImp;
import tn.esprit.pithepowerplayers.repositories.UserRepository;


@Service
@RequiredArgsConstructor
public class UserServiceImp extends IGenericServiceImp<User,Integer> implements IUserService{
    private final UserRepository userRepository ;
}

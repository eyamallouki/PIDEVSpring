package tn.esprit.pithepowerplayers.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pithepowerplayers.entities.User;
import tn.esprit.pithepowerplayers.generic.GenericController;
import tn.esprit.pithepowerplayers.services.IUserService;
import tn.esprit.pithepowerplayers.storage.UserStorage;

import java.util.Set;


@RestController
@AllArgsConstructor
@RequestMapping("/User")
public class UserController extends GenericController<User, Integer> {
    private final IUserService userService;

}
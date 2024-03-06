package tn.esprit.pithepowerplayers.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.pithepowerplayers.entities.Department;
import tn.esprit.pithepowerplayers.generic.IGenericServiceImp;


@Service
@Slf4j
@AllArgsConstructor
public class IDepartementServiceImpl extends IGenericServiceImp<Department,Integer> implements IDepartementService{


}

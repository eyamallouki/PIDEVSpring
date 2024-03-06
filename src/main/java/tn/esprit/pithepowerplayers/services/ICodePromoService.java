package tn.esprit.pithepowerplayers.services;

import tn.esprit.pithepowerplayers.entities.AgencyOffer;
import tn.esprit.pithepowerplayers.entities.CodePromo;
import tn.esprit.pithepowerplayers.generic.IGenericService;

public interface ICodePromoService extends IGenericService<CodePromo,Integer > {
    public CodePromo validerCodePromo(String code);
    public void decrementerNombreUtilisations(CodePromo codePromo);

}

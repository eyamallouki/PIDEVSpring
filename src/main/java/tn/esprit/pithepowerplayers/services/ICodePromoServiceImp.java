package tn.esprit.pithepowerplayers.services;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.pithepowerplayers.entities.AgencyOffer;
import tn.esprit.pithepowerplayers.entities.CodePromo;
import tn.esprit.pithepowerplayers.generic.IGenericServiceImp;
import tn.esprit.pithepowerplayers.repositories.CodePromoRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ICodePromoServiceImp extends IGenericServiceImp<CodePromo,Integer> implements ICodePromoService{
    private  final CodePromoRepository codePromoRepository ;


    @Override
    public CodePromo validerCodePromo(String code) {
        CodePromo codePromo = codePromoRepository.findCodePromoByCode(code);
        if (codePromo == null || codePromo.getExpirationDate().isBefore(LocalDate.now()) || codePromo.getNumberOfUsing() == 0) {
            return null; // code promo invalide ou expiré
        }
        return codePromo; // code promo valide
    }

    @Override
    public void decrementerNombreUtilisations(CodePromo codePromo) {
        codePromo.setNumberOfUsing(codePromo.getNumberOfUsing() - 1);
        codePromoRepository.save(codePromo);
    }






   /* @Override
    public CodePromo validerCodePromo(String code) {

    CodePromo codePromo = codePromoRepository.findCodePromoByCode(code);

    if (codePromo == null || codePromo.getExpirationDate().isBefore(LocalDate.now()) || codePromo.getNumberOfUsing() == 0) {
        return null; // code promo invalide ou expiré
    }

    return codePromo; // code promo valide
}

@Override
    public void decrementerNombreUtilisations(CodePromo codePromo) {
        codePromo.setNumberOfUsing(codePromo.getNumberOfUsing() - 1);
        codePromoRepository.save(codePromo);
    }*/

    @Scheduled(fixedDelay = 24 * 60 * 60 * 1000) // cette méthode sera exécutée une fois par jour
    public void marquerCodesPromoExpirees() {

        List<CodePromo> codesPromo = codePromoRepository.findByExpirationDateBefore(LocalDate.now()); // récupère tous les codes promo expirés

        if (codesPromo!=null) {
            for (CodePromo codePromo : codesPromo) {
                codePromo.setExpire(true); // marque le code promo comme expiré
                codePromoRepository.save(codePromo); // enregistre les modifications dans la base de données
            }
        }
    }


}

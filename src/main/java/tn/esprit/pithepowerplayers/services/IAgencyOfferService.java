package tn.esprit.pithepowerplayers.services;

import org.springframework.web.multipart.MultipartFile;
import tn.esprit.pithepowerplayers.entities.AgencyOffer;
import tn.esprit.pithepowerplayers.entities.AgencyOfferType;
import tn.esprit.pithepowerplayers.generic.IGenericService;

import java.io.IOException;
import java.util.List;

public interface IAgencyOfferService extends IGenericService<AgencyOffer,Integer > {
    public AgencyOffer AssignAgencToOff(Integer id_AgencyOffer, Integer  id_User);

    public AgencyOffer assignAgencyOfferToAgencyOfferType(Integer id_AgencyOffer, AgencyOfferType agencyOfferType);

    public Integer getOfferCountByType(AgencyOfferType agencyOfferType);
    public List<AgencyOffer> getAgencyOffersByLocation(String location);
    public Integer getCountAgencyOffersByLocation(String location) ;

    public  AgencyOffer AssignAgencyOfferToCodePromo(Integer id_AgencyOffer, Integer id_code);


   public void appliquerReductionOffre(Integer  id_AgencyOffer, Float reduction);

}

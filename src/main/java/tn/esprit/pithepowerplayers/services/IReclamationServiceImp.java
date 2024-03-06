package tn.esprit.pithepowerplayers.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.pithepowerplayers.Mailing.EmailService;
import tn.esprit.pithepowerplayers.Mailing.EmailUtils;
import tn.esprit.pithepowerplayers.Mailing.MailModel;
import tn.esprit.pithepowerplayers.entities.Reclamation;
import tn.esprit.pithepowerplayers.entities.User;
import tn.esprit.pithepowerplayers.generic.IGenericServiceImp;
import tn.esprit.pithepowerplayers.repositories.ReclamationRepository;
import tn.esprit.pithepowerplayers.repositories.UserRepository;

import java.util.HashMap;


@Service
@RequiredArgsConstructor
public class IReclamationServiceImp extends IGenericServiceImp<Reclamation,Integer> implements IReclamationService{
    private final ReclamationRepository reclamationRepository;
    private final UserRepository userRepository;
    private final EmailService emailService;
    public void sendMail(User student, String message) throws Exception {
        MailModel mail = new MailModel();
        mail.setFrom("pfetest2021@gmail.com");
        mail.setTo(student.getEmail_Address());
        mail.setHTML(true);
        mail.setSubject("test");
        mail.setHtmlContent(message);
        mail.setHtmlContent(EmailUtils.htmlMailExemple());
        emailService.sendMail(mail);
    }

    @Transactional
    @Override
    public Reclamation AddAndAssignReclamationToStudentParMail(Integer id_User, Reclamation r) throws Exception {
        User student = userRepository.findById(id_User).orElse(null);
        if (student != null){
            Reclamation reclamation = reclamationRepository.save(r);
            reclamation.setUser(student);
            this.sendMail(student, "you received a reclamation");
        }
        return null;
    }

}

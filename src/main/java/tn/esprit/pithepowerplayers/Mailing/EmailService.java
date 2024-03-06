package tn.esprit.pithepowerplayers.Mailing;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.Async;

import javax.transaction.Transactional;

public interface EmailService {
    void sendEmail(SimpleMailMessage email);


    @Async
    @Transactional
    void sendMail(MailModel mail) throws Exception;
}

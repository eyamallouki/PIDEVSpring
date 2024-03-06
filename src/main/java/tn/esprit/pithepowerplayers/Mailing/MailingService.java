package tn.esprit.pithepowerplayers.Mailing;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.transaction.Transactional;

@Service
public class MailingService implements EmailService {
    private final JavaMailSender javaMailSender;


    private final String from = "benromdhan.azza99@gmail.com";

    public MailingService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }


    @Override
    public void sendEmail(SimpleMailMessage email) {

    }

    @Async
    @Transactional
    @Override
    public void sendMail(MailModel mail) throws Exception {
        if (mail.isHTML()) {
            try {
                InternetAddress[] parsed;
                try {
                    parsed = InternetAddress.parse(mail.getTo());
                } catch (AddressException e) {
                    throw new AddressException("addresse invalid");
                }
                MimeMessage mailMessage = javaMailSender.createMimeMessage();
                mailMessage.setSubject("confimer votre compte", "UTF-8");
                MimeMessageHelper helper = new MimeMessageHelper(mailMessage, true, "UTF-8");

                helper.setFrom(from);
                helper.setTo(parsed);
                helper.setSubject(mail.getSubject());
                helper.setText(mail.getHtmlContent(), true);
                javaMailSender.send(mailMessage);
            } catch (MessagingException ex) {
                throw new MessagingException("erreur lors de l'envoie du mail",ex);
            }
        } else {
            SimpleMailMessage msg = new SimpleMailMessage();
            msg.setFrom(mail.getFrom());
            msg.setTo(mail.getTo());
            msg.setText(mail.getText());
            msg.setSubject(mail.getSubject());
            javaMailSender.send(msg);
        }
    }
}

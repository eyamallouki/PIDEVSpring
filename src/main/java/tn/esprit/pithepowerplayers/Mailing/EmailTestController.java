package tn.esprit.pithepowerplayers.Mailing;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/emailtest")
@AllArgsConstructor
public class EmailTestController {
    private  final EmailService emailService;

    @GetMapping("/htmlmail")
    public ResponseEntity sendHtmlMailTest() throws Exception {
        MailModel mail = new MailModel();
        mail.setFrom("pfetest2021@gmail.com");
        mail.setTo("benromdhan.azza99@gmail.com");
        mail.setHTML(true);
        mail.setSubject("test");
        mail.setHtmlContent(EmailUtils.htmlMailExemple());
        emailService.sendMail(mail);
        HashMap<String, String> map = new HashMap<>();
        map.put("message", "email est en cours d'envoie");
        return ResponseEntity.ok(map);
    }

    @GetMapping("/simplemail")
    public ResponseEntity sendSimpleMailTest() throws Exception {
        MailModel mail = new MailModel();
        mail.setFrom("celina.celine999@gmail.com");
        mail.setTo("benromdhan.azza99@gmail.com");
        mail.setHTML(false);
        mail.setSubject("test");
        mail.setText("welcome");
        emailService.sendMail(mail);
        HashMap<String, String> map = new HashMap<>();
        map.put("message", "email est en cours d'envoie");
        return ResponseEntity.ok(map);
    }
}

package tn.esprit.pithepowerplayers.SMS;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;


@Component
public class SmsService {


    private final String ACCOUNT_SID ="AC6da0b69d2bf9e1898ab0bb4a65a81a9f";

    private final String AUTH_TOKEN = "8318d74e59fd752e632ca343a83a5bbb";

    private final String FROM_NUMBER = "+15674234482" +
            "";

    public void send(SmsPojo sms) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber(sms.getTo()), new PhoneNumber(FROM_NUMBER),"Bonjour 🎉nous vous confirmons votre réservation pour l'offre "+sms.getMessage()) .create();
        System.out.println("here is my id:"+message.getSid());// Unique resource ID created to manage this transaction

    }

    public void receive(MultiValueMap<String, String> smscallback) {
    }

}

package ua.edu.ucu.apps.task2;

import ua.edu.ucu.apps.task2.MailStrategy.*;

public class MailSender {
    public void sendMail(MailInfo mailInfo) {
        MailStrategy strategy = switch (mailInfo.mailCode) {
            case BIRTHDAY -> new BirthdayMail();
            case UtServ_PAYMENT -> new UtilityServicesPaymentMail();
            case GIFT -> new GiftMail();
            case NOT_SPECIFIED -> new DefaultMail();
        };

        strategy.generateMessage();
    }
}

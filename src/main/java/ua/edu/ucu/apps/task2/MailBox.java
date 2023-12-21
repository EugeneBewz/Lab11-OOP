package ua.edu.ucu.apps.task2;

import java.util.ArrayList;

public class MailBox {
    ArrayList<MailInfo> infos;
    MailSender mailSender = new MailSender();

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        for (MailInfo info : infos) {
            mailSender.sendMail(info);
        }
    }
}

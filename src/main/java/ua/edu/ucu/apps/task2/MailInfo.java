package ua.edu.ucu.apps.task2;

import ua.edu.ucu.apps.task2.MailStrategy.MailCode;

public class MailInfo {
    Client client;
    MailCode mailCode;

    public MailInfo(Client client, MailCode mailCode) {
        this.client = client;
        this.mailCode = mailCode;
    }

}

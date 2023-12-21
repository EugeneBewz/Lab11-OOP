package ua.edu.ucu.apps.task2.MailStrategy;

import lombok.Setter;
import ua.edu.ucu.apps.task2.Client;

public class Mail implements MailStrategy {
    private final Client client;
    @Setter
    private MailCode mailCode;

    public Mail() {
        this.client = Client.builder().build();
        this.mailCode = MailCode.NOT_SPECIFIED;
    }

    public Mail(Client client) {
        this.client = client;
        this.mailCode = MailCode.NOT_SPECIFIED;
    }

    public Mail(Client client, MailCode mailCode) {
        this.client = client;
        this.mailCode = mailCode;
    }


    @Override
    public void generateMessage() {
        System.out.println(mailCode.toString() + "card for " + client.getName());
    }
}

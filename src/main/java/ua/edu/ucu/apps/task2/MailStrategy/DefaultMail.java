package ua.edu.ucu.apps.task2.MailStrategy;

import ua.edu.ucu.apps.task2.Client;

public class DefaultMail extends Mail {
    private static final Client client = Client.builder().build();

    public DefaultMail() {
        super(client);
    }

    @Override
    public void generateMessage() {
        System.out.println("Hi, " + client.getName() + "!");
    }
}

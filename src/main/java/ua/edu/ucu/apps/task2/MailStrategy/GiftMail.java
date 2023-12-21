package ua.edu.ucu.apps.task2.MailStrategy;

import ua.edu.ucu.apps.task2.Client;

public class GiftMail extends Mail {
    private static final Client client = Client.builder().build();
    private final Client sender;

    public GiftMail(Client sender) {
        super(client);
        this.sender = sender;
    }

    public GiftMail() {
        super(client);
        this.sender = Client.builder().build();
    }

    @Override
    public void generateMessage() {
        System.out.println("Congratulations, " + client.getName() + "!");
        System.out.println("You've just received a gift from " + sender.getName() + ".");
        System.out.println("Hope you like it. :)");
    }
}

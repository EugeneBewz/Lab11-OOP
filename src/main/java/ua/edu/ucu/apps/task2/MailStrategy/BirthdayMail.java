package ua.edu.ucu.apps.task2.MailStrategy;

import ua.edu.ucu.apps.task2.Client;

public class BirthdayMail extends Mail {

    private static final Client client = Client.builder().build();
    private final String wishes;
    private final Client author;


    public BirthdayMail(String wishes, Client author) {
        super(client);
        this.wishes = wishes;
        this.author = author;
    }

    public BirthdayMail() {
        super(client);
        this.wishes = "all the best";
        this.author = Client.builder().build();
    }

    @Override
    public void generateMessage() {
        System.out.println("Happy birthday, " + client.getName() + "!");
        System.out.println("Today you are " + client.getAge() + "years old.");
        System.out.println("We wish you " + wishes + ".");
        System.out.println("From " + author.getName());
    }
}

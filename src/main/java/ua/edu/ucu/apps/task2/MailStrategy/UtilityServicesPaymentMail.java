package ua.edu.ucu.apps.task2.MailStrategy;

import ua.edu.ucu.apps.task2.Client;

public class UtilityServicesPaymentMail extends Mail {
    private static final Client client = Client.builder().build();
    private final double debt;

    public UtilityServicesPaymentMail(double debt) {
        super(client);
        this.debt = debt;
    }

    public UtilityServicesPaymentMail() {
        super(client);
        this.debt = 0.00;
    }

    @Override
    public void generateMessage() {
        System.out.println("Dear " + client.getName() + ",");
        System.out.println("We inform you that this month you have to pay $" + debt + " for utility services.");
        System.out.println("Best regards, ...");
    }
}

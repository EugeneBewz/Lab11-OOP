package ua.edu.ucu.apps.task2.MailStrategy;

public enum MailCode {
    BIRTHDAY("Birthday"),
    UtServ_PAYMENT("Utility Services Payment"),
    GIFT("Gift"),
    NOT_SPECIFIED("Unknown");

    private final String label;

    MailCode(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}

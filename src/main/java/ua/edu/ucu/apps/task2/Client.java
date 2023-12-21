package ua.edu.ucu.apps.task2;

import lombok.Builder;
import lombok.ToString;

@Builder @ToString
public class Client {
    @Builder.Default private static int id = 0;
    private static String name;
    private static int age;
    @Builder.Default private static Sex sex = Sex.NOT_SPECIFIED;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

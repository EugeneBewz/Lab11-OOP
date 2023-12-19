package ua.edu.ucu.apps.task1;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

enum Gender {
    MALE, FEMALE, UNKNOWN
}

@SuperBuilder @ToString
@Setter @Getter
public class User {
    private String name;
    private int age;
    @Builder.Default private Gender gender = Gender.UNKNOWN;
    private double weight;
    private double height;
}


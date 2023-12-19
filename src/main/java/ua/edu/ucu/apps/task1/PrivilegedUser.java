package ua.edu.ucu.apps.task1;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder @ToString
@Setter @Getter
public class PrivilegedUser extends User {
    @Builder.Default private boolean isAdmin = false;
}

package ua.edu.ucu.apps.task1;

public class Test {
    public static void main(String[] args) {
        User user = User.builder().name("Eugene").age(20).build();
        PrivilegedUser superUser = PrivilegedUser.builder().name("Eugene").age(20).isAdmin(true).build();

        System.out.println(user + "\n");

        System.out.println(superUser);
        System.out.println("Privileged user name is: " + superUser.getName());
    }
}

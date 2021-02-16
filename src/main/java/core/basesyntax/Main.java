package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        String[] records = {"testEmail@gmail.com:100"};
        String email = "invalidEmail@gmail.com";
        UserService userService = new UserService();
        System.out.println(userService.getUserScore(records, email));
    }
}

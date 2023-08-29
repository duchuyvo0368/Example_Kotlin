package di.di2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new AnotherUserRepository();
        UserService userService = new UserService(userRepository);
        List<User> users=userService.getUser();
    }
}

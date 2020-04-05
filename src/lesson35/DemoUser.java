package lesson35;

import lesson35.model.User;
import lesson35.model.UserType;
import lesson35.repository.UserRepository;

public class DemoUser {
    public static void main(String[] args) throws Exception {
        UserRepository userRepository = new UserRepository();

        User user1 = new User(1,"nameTest1", "12df45", "PL", UserType.USERS);
        User user2 = new User(2,"nameTest2", "09876", "PL", UserType.USERS);
        User user3 = new User(30990,"Kurwa", "94781", "PL", UserType.USERS);
        User user4 = new User(34, "Ludovik", "1224", "USA", UserType.USERS);
        User user5 = new User(4534423, "Wrocyk", "87654", "UA", UserType.USERS);

        userRepository.registerUser(user5);

    }
}

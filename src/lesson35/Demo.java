package lesson35;

import lesson35.model.User;
import lesson35.model.UserType;
import lesson35.repository.UserRepository;

public class Demo {
    public static void main(String[] args) throws Exception {
        UserRepository userRepository = new UserRepository();
        User user1 = new User(0,"kurde", "12df45", "PL", UserType.USERS);
        userRepository.registerUser(user1);


    }
}


package lesson35;

import lesson35.controller.UserController;
import lesson35.model.User;
import lesson35.model.UserType;


public class DemoUser {
    public static void main(String[] args) throws Exception {
        UserController userController = new UserController();

        User user1 = new User(1, "nameTest1", "12df45", "PL", UserType.USERS);
        User user2 = new User(2, "nameTest2", "09876", "PL", UserType.USERS);

        userController.registerUser(user1);
        userController.registerUser(user2);


    }
}

package lesson35.controller;

import lesson35.model.User;
import lesson35.service.UserService;

public class UserController {
    //обрабатывает все запросы касательно юзера
    //будут методы (функции моего сайта)
    private UserService userService = new UserService();

    public User registerUser(User user) throws Exception {
        if (user == null)
            throw new Exception("Can't save null user");
        return userService.registerUser(user);
    }
}

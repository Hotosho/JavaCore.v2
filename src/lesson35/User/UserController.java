package lesson35.User;

public class UserController {
    //обрабатывает все запросы касательно юзера
    //будут методы (функции моего сайта)
    private UserService userService = new UserService();
    private UserRepository userRepository = new UserRepository();


    public User registerUser(User user) throws Exception {
        if (user == null)
            throw new Exception("Can't save null user");
        try {
            userRepository.checkFindById(user.getId(),userRepository.)

        }

        return userService.registerUser(user);
    }
}

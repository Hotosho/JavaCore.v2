package lesson35.service;

import lesson35.model.User;
import lesson35.repository.UserRepository;

public class UserService {
    // проверяет бизнес правила
    // поля обетков не могут быть пустие
    // юзеру больше 18 лет

    private UserRepository userRepository = new UserRepository();

    public User registerUser(User user) throws Exception {
        return userRepository.registerUser(user);
    }
}

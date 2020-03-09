package lesson35.User;

public class UserService {
    // проверяет бизнес правила
    // поля обетков не могут быть пустие
    // юзеру больше 18 лет

    private UserRepository userRepository = new UserRepository();

    public User registerUser(User user) {
        //check buinesLogic
        //if logic is ok (if wrong = null)
        return userRepository.registerUser(user);

    }
}

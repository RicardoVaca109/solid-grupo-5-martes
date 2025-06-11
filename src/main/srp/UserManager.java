public class UserManager {
    private final UserValidator validator;
    private final UserRepository repository;
    private final NotificationService notifier;

    public UserManager(UserValidator validator, UserRepository repository, NotificationService notifier) {
        this.validator = validator;
        this.repository = repository;
        this.notifier = notifier;
    }

    public void addUser(String email, String password) {
        if (validator.isValidEmail(email) && validator.isValidPassword(password)) {
            repository.save(email, password);
            notifier.sendWelcomeEmail(email);
        } else {
            System.out.println("Invalid email or password. User not added.");
        }
    }
}
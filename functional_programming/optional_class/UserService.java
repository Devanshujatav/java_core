import java.util.Optional;

class User {
    private String email;

    public User(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }
}

public class UserService {

    // Returns an Optional containing the email if it exists
    public Optional<String> getEmail(User user){
        return Optional.ofNullable(user.getEmail());
    }

    public void notifyUser(User user){
        getEmail(user).map(String::toLowerCase).ifPresent(email -> System.out.println("Sending Email : " + email));
    }

    public static void main(String[] args) {
        UserService service = new UserService();

        User user1 = new User("John@Example.COM");

        User user2 = new User(null);

        System.out.println("User1  : ");
        service.notifyUser(user1);

        System.out.println();

        System.out.println("User 2");
        service.notifyUser(user2);
    }
}



package effective.java.com.chain.of.responsibility;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserExistsMiddleware extends Middleware {
    private final Server server;

    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(email, password);
    }
}

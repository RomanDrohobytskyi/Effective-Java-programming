package effective.java.com.functional.programming.bank.module.util;

import effective.java.com.functional.programming.bank.module.model.Gender;
import effective.java.com.functional.programming.bank.module.model.User;

public class UserUtils {
    public static final int ADULT_AGE = 18;

    public static boolean isAdult(User user) {
        return user.getAge() >= ADULT_AGE;
    }

    public static boolean isMale(User user) {
        return user.getGender().getId() == Gender.MALE.getId();
    }

    public static boolean isFemale(User user) {
        return !isMale(user);
    }
}

package spring.security.validators;

import spring.security.model.User;

/**
 * Created by Imant on 04.04.17.
 */
public class UserValidator {

    public boolean checkUserField(User user) {
        User newUser = new User(0, null, null);
        return !(user.equals(newUser));
    }
}

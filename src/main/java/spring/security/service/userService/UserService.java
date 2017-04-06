package spring.security.service.userService;

import spring.security.model.User;

public interface UserService {

    User getUser(String login);

    User getUserFromDB(String login);

}

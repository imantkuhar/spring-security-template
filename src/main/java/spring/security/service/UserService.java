package spring.security.service;

import spring.security.entity.User;

public interface UserService {

    User getUser(String login);

}

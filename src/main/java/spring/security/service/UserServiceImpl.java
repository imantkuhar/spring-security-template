package spring.security.service;

import spring.security.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String login) {
        User user = new User();
        user.setLogin(login);
        user.setPassword("011c945f30ce2cbafc452f39840f025693339c42");

        return user;
    }

}

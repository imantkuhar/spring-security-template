package spring.security.service.userService;

import spring.security.model.User;
import org.springframework.stereotype.Service;
import spring.security.service.userDBService.DBServiceImpl;

@Service
public class UserServiceImpl implements UserService {

    DBServiceImpl userService = new DBServiceImpl();

    @Override
    public User getUser(String login) {
        User user = new User();
        user.setLogin(login);
        user.setPassword("7110eda4d09e062aa5e4a390b0a572ac0d2c0220");

        return user;
    }

    @Override
    public User getUserFromDB(String login){
        System.out.println(login);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(userService.getByLogin(login).toString());
        return userService.getByLogin(login);
    }

}

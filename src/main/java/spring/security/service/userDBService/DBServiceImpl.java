package spring.security.service.userDBService;

import spring.security.db.UserDao;
import spring.security.model.User;

/**
 * Created by Imant on 04.04.17.
 */
public class DBServiceImpl implements DBService<User> {

    private UserDao userDao = new UserDao();

    @Override
    public User add(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public User getByLogin(String login) {
        return userDao.getUserByName(login);
    }
}

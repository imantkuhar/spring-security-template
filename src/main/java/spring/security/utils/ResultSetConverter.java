package spring.security.utils;

import spring.security.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Imant on 04.04.17.
 */
public class ResultSetConverter {

    public static User convertResultSetToUser(ResultSet resultSet) throws SQLException {
        User user = new User(0, null, null);

        if (resultSet.next()) {
            int id = resultSet.getInt("id");
            String login = resultSet.getString("login");
            String password = resultSet.getString("password");

            user.setId(id);
            user.setLogin(login);
            user.setPassword(password);
            return user;
        } else return user;
    }
}

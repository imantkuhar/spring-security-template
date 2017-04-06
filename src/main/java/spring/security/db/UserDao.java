package spring.security.db;

import spring.security.model.User;
import spring.security.utils.ConnectionService;
import spring.security.utils.ResultSetConverter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Created by Imant on 04.04.17.
 */
public class UserDao {

    public static final String GET_USER_BY_NAME_PREPARED_STATEMENT = "SELECT * FROM user WHERE login = ?";

    public User getUserByName(String login) {
        User newUser = new User();

        try (Connection connection = ConnectionService.createConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_USER_BY_NAME_PREPARED_STATEMENT)) {

            preparedStatement.setString(1, login);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.executeQuery();
            newUser = ResultSetConverter.convertResultSetToUser(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return newUser;
    }
}
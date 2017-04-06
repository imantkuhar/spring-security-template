package spring.security.service.userDBService;

/**
 * Created by Imant on 04.04.17.
 */
public interface DBService<T> {

    T add(T t);

    T update(T t);

    boolean deleteById(int id);

    T getById(int id);

    T getByLogin(String login);
}

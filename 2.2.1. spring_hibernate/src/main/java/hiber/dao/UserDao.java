package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();

    User findByModelAndSeries(String model, int series);

    User findByName(String userName);
}

package repository;

import domain.User;
import service.AppObject;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepository {

    public User findByUserId(int id) {

        return new User();

    }

    public void save(User user) throws SQLException {
        PreparedStatement pr = AppObject.connection.prepareStatement("");
    }

    public User FindByFirstName() {
        return new User();
    }

    public User Deletebyid() {

        return new User();
    }


}


package domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class User {
    private String firstname;
    private String lastname;
    private String age;

    public User(){}
    public User(String firstname, String lastname, String age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
}

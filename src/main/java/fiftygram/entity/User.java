package fiftygram.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * Created by mikhailarzumanov on 23.02.16.
 */

@Entity
@Table(name = "User")
public class User {

    //fields

    @Id
    @GenericGenerator(name = "inc", strategy = "increment")
    @GeneratedValue(generator = "inc")
    private long id;

    @Column(name = "login", nullable = false, length = 30)
    private String login;

    @Column(name = "FullName", nullable = false, length = 30)
    private String FullName;

    @Column(name = "PhoneNumber", nullable = false, length = 15)
    private String PhoneNumber;

    @Column(name = "password", nullable = false, length = 20)
    private String password;

    //getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    //constructor
    public User(String login, String FullName,
                String PhoneNumber, String password) {

        this.login = login;
        this.FullName = FullName;
        this.PhoneNumber = PhoneNumber;
        this.password = password;
    }

    public User() {
        //TO-DO empty constructor
    }
}

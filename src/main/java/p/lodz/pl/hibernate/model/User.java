package p.lodz.pl.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "tuser")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String firstName;
    private String lastName;
    private String login;

   // private Pesel pesel;

    public User(String firstName, String lastName, String login) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


}

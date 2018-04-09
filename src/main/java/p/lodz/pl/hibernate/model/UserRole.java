package p.lodz.pl.hibernate.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String role;

    public UserRole() {
    }

    public UserRole(String role) {
        this.role = role;
    }


}

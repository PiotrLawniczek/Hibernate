package p.lodz.pl.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pesel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String peselNumber;



}

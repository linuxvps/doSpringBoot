package com.dospringboot.model;


import javax.persistence.*;

@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;


    @Column(name = "FIRSTNAME", nullable = false)
    private String firstName;

    @Column(name = "LASTNAME", nullable = false)
    private String lastName;


    @Column(name = "EMAIL", nullable = false)
    private String EMAIL;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
}
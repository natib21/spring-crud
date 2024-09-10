package com.luv2code.cruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="student")
public class Student {


     //define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="first_name")
    private String firstName;


    @Column(name="last_name")
    private String lasttName;

    @Column(name="emain")
    private String email;

    //define constructors

    public Student(){}
    public Student(String email, String lasttName, String firstName) {
        this.email = email;
        this.lasttName = lasttName;
        this.firstName = firstName;
    }


    //define getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //generate Override


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lasttName='" + lasttName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

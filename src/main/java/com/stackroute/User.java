package com.stackroute;

import org.springframework.stereotype.Component;

@Component
public class User {
    String fname;
    String lname;

    public User(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public User(){}

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}

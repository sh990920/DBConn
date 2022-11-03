package com.example.DBTest.member;

import javax.persistence.*;

@Entity
public class Member {
    private String name;
    @Id
    @PrimaryKeyJoinColumn
    private String id;
    private String pw;
    private int age;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public String getPw(){
        return pw;
    }

    public int getAge(){
        return age;
    }

    public String getEmail(){
        return email;
    }
}

package com.brkcnszgn.genericrecycleradapter.v2;

import com.brkcnszgn.genericrecycleradapter.BaseModel;

public class User  extends SweetModel {
    private String name;
    private String surname;
    private boolean rememberMe;

    public User(int viewType, String name, String surname,boolean rememberMe){
        super(viewType);
        this.name = name;
        this.surname = surname;
        this.rememberMe = rememberMe;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
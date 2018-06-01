package com.exam.ejb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employees {
    @Id
    private String employeesid;
    private String name;
    private String address;
    private String birthday;
    private int phonenumber;

    public Employees() {
    }

    public Employees(String employeesid, String name, String address, String birthday, int phonenumber) {
        this.employeesid = employeesid;
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.phonenumber = phonenumber;
    }

    public String getEmployeesid() {
        return employeesid;
    }

    public void setEmployeesid(String employeesid) {
        this.employeesid = employeesid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
}

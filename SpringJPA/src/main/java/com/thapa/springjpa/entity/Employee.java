package com.thapa.springjpa.entity;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "tbl_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;

    public Employee() {
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thapa.project.entity;

/**
 *
 * @author thapaniwas
 */
public class Department {
    private int Id;
    private String Name;

    public Department(int Id, String Name) {
        this.Id = Id;
        this.Name = Name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public static class getById {

        public getById() {
        }
    }

    
    
    
}

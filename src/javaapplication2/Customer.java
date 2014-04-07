/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

import java.io.Serializable;

/**
 *
 * @author Duran AYNAL
 */
public class Customer implements Serializable {
     private int id;
     private String name;
     private String surname;
     private int no1;
     private int no2;
     private String address;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNo1() {
        return no1;
    }

    public void setNo1(int no1) {
        this.no1 = no1;
    }

    public int getNo2() {
        return no2;
    }

    public void setNo2(int no2) {
        this.no2 = no2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String toString(){
    
    return this.id+" "+this.name+" "+this.surname+" "+this.no1+" "+this.no2+" "+this.address;
        
    }

}

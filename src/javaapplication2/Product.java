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
public class Product implements Serializable{
    private int id;
    private String description;
    private String dNow;
    private int adet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getdNow() {
        return dNow;
    }

    public void setdNow(String dNow) {
        this.dNow = dNow;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }
    
    @Override
    public String toString(){
    
    return this.getId()+" "+this.getDescription()+" "+this.getAdet()+" "+this.getdNow()+"\n" ;
    }
    
}

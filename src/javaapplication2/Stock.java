/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Duran AYNAL
 */
public class Stock implements Serializable{
    
    ArrayList<Product> products = new ArrayList<>();
    String ser;

    public ArrayList<Product> getStringList() {
        return products;
    }

    public void setStringList(ArrayList<Product> stringList) {
        this.products = products;
    }
    

}

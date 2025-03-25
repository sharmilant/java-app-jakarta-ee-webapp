/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

/**
 *
 * @author Sharmilan
 */
@Entity
@Table(name = "PRODUCT")

public class Product implements Serializable {
    @Id
    @Column( name="ID")
    private int id;
    @Column( name="NAME")
    private String name;
    @Column( name="SELLING_PRICE")
    private double price;
    
    // Constructeur
    public Product(){
       
   }
    
   //Getter and Setter
    
    public  int getId(){
        return id;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setId(int id_){
        this.id= id_;
    }
    
    public void setPrice (double price_){
        this.price = price_;
    }
    
    
}

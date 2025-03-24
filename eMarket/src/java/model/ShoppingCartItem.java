/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.Serializable;

/**
 *
 * @author Sharmilan
 */
public class ShoppingCartItem implements Serializable {

    private int id;
    private int quantity;
    private Product product;

    
    public ShoppingCartItem() {
    }
    
    public int getId() {
        return id;
    }
    public int getQuantity() {
        return quantity;
    }
    public Product getProduct() {
        return product;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    
}

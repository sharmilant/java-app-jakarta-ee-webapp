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
    private double totalPrice;

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    
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
        if (product!=null){
            setTotalPrice(quantity*product.getPrice());
            System.out.println("Updated the total price of the product :" + product.getName());
        }
        
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    
}

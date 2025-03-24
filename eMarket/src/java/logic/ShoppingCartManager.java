/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import model.ShoppingCartItem;
import model.Product;
import java.util.ArrayList;
import java.io.Serializable;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import jakarta.annotation.PostConstruct;

/**
 *
 * @author Sharmilan
 */

@Named
@SessionScoped
public class ShoppingCartManager implements Serializable {
    
    private ArrayList<ShoppingCartItem> listCartItems;

    public ShoppingCartManager() {
        this.listCartItems = new ArrayList<ShoppingCartItem>();
    }

    public ArrayList<ShoppingCartItem> getListCartItems() {
        return listCartItems;
    }

    public void setListCartItems(ArrayList<ShoppingCartItem> listCartItems) {
        this.listCartItems = listCartItems;
    }
    
    public String addToCart(ShoppingCartItem item){
        this.listCartItems.add(item);
        return "";
    }
    
    @PostConstruct
    private void initCart(){
        
        Product prod1 = new Product();
        prod1.setId(1);
        prod1.setName("Phone");
        prod1.setPrice(10);
        
        
        ShoppingCartItem item1 = new ShoppingCartItem();
        item1.setId(1);
        item1.setProduct(prod1);
        item1.setQuantity(20);
        
        String temp = addToCart(item1);
    }
    
    
}

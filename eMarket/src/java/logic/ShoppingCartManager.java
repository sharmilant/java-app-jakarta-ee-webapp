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
    private Product prodToAdd;


    public ShoppingCartManager() {
        this.listCartItems = new ArrayList<ShoppingCartItem>();
    }

    public ArrayList<ShoppingCartItem> getListCartItems() {
        return listCartItems;
    }

    public void setListCartItems(ArrayList<ShoppingCartItem> listCartItems) {
        this.listCartItems = listCartItems;
    }
    
    
    public Product getProdToAdd() {
        return prodToAdd;
    }

    public void setProdToAdd(Product prodToAdd) {
        this.prodToAdd = prodToAdd;
    }

    public void testFunction(){
        System.out.println("Button clicked with product : " + prodToAdd.getName());
    }
    
    public String addToCart(){
        if (prodToAdd == null){
            System.out.println("Erreur : Aucun produit sélectionné !");
        }
        
        System.out.println("Produit sélectionné : " + prodToAdd.getName());
        ShoppingCartItem item = new ShoppingCartItem();
        
        item.setId(listCartItems.size()+1);
        item.setQuantity(1);
        item.setProduct(prodToAdd);
        listCartItems.add(item);
        
        
        
        System.out.println("Produit ajouté : " + prodToAdd.getName());
        setProdToAdd(null);
        return "fromCatalogToShoppingCart";
        
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
        
        //this.listCartItems.add(item1);
    }
    
    
}

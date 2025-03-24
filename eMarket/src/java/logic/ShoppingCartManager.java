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
    private ShoppingCartItem itemToUpdate;

    public ShoppingCartItem getItemToUpdate() {
        return itemToUpdate;
    }

    public void setItemToUpdate(ShoppingCartItem itemToUpdate) {
        this.itemToUpdate = itemToUpdate;
    }

    

   


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


    
    public String addToCart(){
        if (prodToAdd == null){
            System.out.println("Erreur : Aucun produit sélectionné !");
            
        }
        
        for (int i=0; i<listCartItems.size(); i++){
            ShoppingCartItem itemLoc = listCartItems.get(i);
            if (itemLoc.getProduct().getId() == prodToAdd.getId()){
                itemLoc.setQuantity(itemLoc.getQuantity() + 1);
                System.out.println("Produit sélectionné : " + prodToAdd.getName());
                System.out.println("Mis à jour de la quantité du produit : " + itemLoc.getQuantity());
                return "fromCatalogToShoppingCart";
            }   
        }

        System.out.println("Produit sélectionné : " + prodToAdd.getName());
        ShoppingCartItem item = new ShoppingCartItem();
        item.setId(listCartItems.size()+1);
        item.setProduct(prodToAdd);
        item.setQuantity(1);
        
        listCartItems.add(item);
        
        
        
        System.out.println("Produit ajouté : " + prodToAdd.getName());
        setProdToAdd(null);
        return "fromCatalogToShoppingCart";
        
    }
    
    public void reduceQuantityFromCart(){
        if (itemToUpdate == null){
            System.out.println("Erreur : Aucun produit sélectionné pour retirer !");
            
        } 
        else{
            for (int i=0; i<listCartItems.size(); i++){
                ShoppingCartItem itemLoc = listCartItems.get(i);
                if (itemLoc.getId() == itemToUpdate.getId()){
                    System.out.println("Produit sélectionné : " + itemLoc.getProduct().getName());
                    if (itemLoc.getQuantity()>1){
                        itemLoc.setQuantity(itemLoc.getQuantity() - 1);
                        System.out.println("Mis à jour de la quantité du produit : " + itemLoc.getQuantity());
                    }
                    else{
                        listCartItems.remove(i);
                        System.out.println("Le produit a été retiré");
                    } 
                    return ;
                }   
            }
            
        }
        
    }
    
    public void addQuantityFromCart(){
        if (itemToUpdate == null){
            System.out.println("Erreur : Aucun produit sélectionné pour retirer !");
            
        } 
        else{
            
            for (int i=0; i<listCartItems.size(); i++){
                ShoppingCartItem itemLoc = listCartItems.get(i);
                if (itemLoc.getId() == itemToUpdate.getId()){
                    System.out.println("Produit sélectionné : " + itemLoc.getProduct().getName());
                    itemLoc.setQuantity(itemLoc.getQuantity() + 1);
                    System.out.println("Mis à jour de la quantité du produit : " + itemLoc.getQuantity());
                    return ;
                }   
            }   
        }
        
    }
    
    
    public void removeFromCart(){
        if (itemToUpdate == null){
            System.out.println("Erreur : Aucun produit sélectionné pour retirer !");
            
        } 
        else{
            for (int i=0; i<listCartItems.size(); i++){
                ShoppingCartItem itemLoc = listCartItems.get(i);
                if (itemLoc.getId() == itemToUpdate.getId()){
                    System.out.println("Produit sélectionné : " + itemLoc.getProduct().getName());
                    listCartItems.remove(i);
                    System.out.println("Le produit a été retiré");
                    return ;
                }   
            }
        }    
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

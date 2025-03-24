/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import model.Product;
import java.util.ArrayList;
import java.io.Serializable;
import jakarta.inject.Named;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.annotation.PostConstruct;


/**
 *
 * @author Sharmilan
 */

@Named
@ApplicationScoped
public class CatalogManager implements Serializable{
    private ArrayList<Product> listProducts;
    private int prodIdForm;
    private String prodNameForm;
    private double prodPriceForm;
    
    public CatalogManager(){
        this.listProducts = new ArrayList<Product> ();
    };
    
    public void setListProducts(ArrayList<Product> listProducts_){
        this.listProducts = listProducts_;
    }
    
    public ArrayList<Product> getListProducts(){
        return listProducts;
    }
    
    public int getProdIdForm(){
        return prodIdForm;
    }
    
    public void setProdIdForm(int _prodIdForm){
        this.prodIdForm = _prodIdForm;
    }
    
    public String getProdNameForm(){
        return prodNameForm;
    }
    
    public void setProdNameForm(String _prodNameForm){
        this.prodNameForm = _prodNameForm;
    }
    
    public double getProdPriceForm(){
        return prodPriceForm;
    }
    
    public void setProdPriceForm(double _price){
        this.prodPriceForm = _price;
    }
    
    public void addToCatalog(Product prod){
        this.listProducts.add(prod);
    }
    
    public String createProduct(){
        Product formProd = new Product();
        formProd.setId(getProdIdForm());
        formProd.setName(getProdNameForm());
        formProd.setPrice(getProdPriceForm());
        
        addToCatalog(formProd);
        
        setProdPriceForm(0);
        setProdNameForm("");
        setProdIdForm(0);
        
        return "fromProductCreateToCatalog";
    }
    
    @PostConstruct
    public void initCatalog(){
        Product prod1 = new Product();
        prod1.setId(1);
        prod1.setName("Phone");
        prod1.setPrice(10);
        
        
        Product prod2 = new Product();
        prod2.setId(2);
        prod2.setName("Brakes");
        prod1.setPrice(100);
        
        addToCatalog(prod1);
        addToCatalog(prod2);
        
        
        
    }
}

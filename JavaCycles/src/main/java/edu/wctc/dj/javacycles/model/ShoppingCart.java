package edu.wctc.dj.javacycles.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Serializable {
    private List<Product> contents = new ArrayList<>();
    
    /**
     * what i'd like to is store a map with <product,qty> and
     * then look to see if the product already exists, 
     * if yes, then i can up the qty,
     * if no, then i can add the product to the map
     * @return 
     */

    public List<Product> getContents() {
        return contents;
    }

    public void setContents(List<Product> contents) {
        this.contents = contents;
    }
    
    public int getItemsInCart(){
        return contents.size();
    }
    
    public void add(Product prod){
        contents.add(prod);
    }
    
    public void remove(Product prod){
        contents.remove(prod);
    }
    
    public void removeAll(){
        contents.clear();
    }
    
}

package edu.wctc.dj.week9.javacyclesjsf.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Serializable {
    private List<Product> contents = new ArrayList<>();

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

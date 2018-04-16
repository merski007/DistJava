package edu.wctc.dj.javacycles.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart implements Serializable {

    //private List<Product> contents = new ArrayList<>();
    private Map<Product, Integer> contents = new HashMap<>();

    /**
     * what i'd like to is store a map with <product,qty> and then look to see
     * if the product already exists, if yes, then i can up the qty, if no, then
     * i can add the product to the map
     *
     * @return
     */
    //Map section
//    public Map getContents() {
//        return contents;
//    }
    
    public List<Product> getContents(){
        List<Product> keys = new ArrayList<>(contents.keySet());
        return keys;
    }
    
    public int getQty(Product prod){
        return contents.get(prod);
    }
    

    public void setContents(Map contents) {
        this.contents = contents;
    }

    public int getItemsInCart() {
        return contents.size();
    }

    public void add(Product prod) {
        if (!contents.containsKey(prod)) {
            contents.put(prod, 1);
        } 
        else if (contents.containsKey(prod)) {
            contents.put(prod, contents.get(prod) + 1);
        }
        

        //contents.add(prod);
    }

    public void remove(Product prod) {
        contents.remove(prod);
    }

    public void removeAll() {
        contents.clear();
    }

    /*List section
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
     */
}

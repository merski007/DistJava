package edu.wctc.dj.week12.javacyclesspringboot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart implements Serializable {

    private Map<Product, Integer> contents = new HashMap<>();

    public List<Product> getContents() {
        List<Product> keys = new ArrayList<>(contents.keySet());
        return keys;
    }

    public int getQty(Product prod) {
        return contents.get(prod);
    }

    public void setContents(Map contents) {
        this.contents = contents;
    }

    public int getItemsInCart() {
        int temp = 0;
        for (int x : contents.values()) {
            temp += x;
        }

        return temp;
    }

    public void add(Product prod) {
        if (!contents.containsKey(prod)) {
            contents.put(prod, 1);
        } 
        else{
            contents.put(prod, contents.get(prod) + 1);
        }
    }

    public void remove(Product prod) {
        contents.remove(prod);
    }

    public void removeAll() {
        contents.clear();
    }

}

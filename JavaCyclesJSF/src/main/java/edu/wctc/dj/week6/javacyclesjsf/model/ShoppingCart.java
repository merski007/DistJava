package edu.wctc.dj.week6.javacyclesjsf.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private String cartId;
    private List<LineItem> lineItemArrayList = new ArrayList<>();

    public ShoppingCart(String cartId) {
        this.cartId = cartId;
    }
    
    public final void addLineItem(Product product, int qty) {
        LineItem item = new LineItem(product, qty);
        lineItemArrayList.add(item);
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public List<LineItem> getLineItemArrayList() {
        return lineItemArrayList;
    }

    public void setLineItemArrayList(List<LineItem> lineItemArrayList) {
        this.lineItemArrayList = lineItemArrayList;
    }
    
    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart("1");
        ProductService ps = new ProductService();
        
//        Product item1 = ps.getProduct("1");
//        Product item2 = ps.getProduct("4");
        
//        System.out.println(item1);
        
//        sc.addLineItem(item1, 1);
//        
        sc.addLineItem(ps.getProduct("1"), 1);
        sc.addLineItem(ps.getProduct("4"), 2);
        
        System.out.println(sc.getLineItemArrayList());
//        System.out.println("test");
//        System.out.println(sc.getCartId());
    }

}

package edu.wctc.dj.week4.model;

import java.util.List;

public class ShoppingCart {

    private String cartId;
    private List<LineItem> lineItemArrayList;

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

}

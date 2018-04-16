package edu.wctc.dj.javacycles.beans;

import edu.wctc.dj.javacycles.model.Product;
import edu.wctc.dj.javacycles.model.ShoppingCart;
import edu.wctc.dj.javacycles.service.ShoppingCartService;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.faces.context.FacesContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cartBean")
@Scope("session")
public class CartBean implements Serializable {
    
    private final String sessionId;
    private final ShoppingCart cart;
    private final ShoppingCartService cartService = new ShoppingCartService();
    private List<Product> productList;
    //private Map productList;
    private double cartTotal = 0.0;

    public CartBean() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        sessionId = facesContext.getExternalContext().getSessionId(true);
        
        cart = cartService.getContents(sessionId);
    }
    
    public int getItemsInCart() {
        return cart.getItemsInCart();
    }
    
    public String getContents() {
        productList = cart.getContents();
        //productList = (List<Product>) cartService.getContents(sessionId);
        return "shoppingCart";
    }
    
    public int getQty(Product prod) {
        return cart.getQty(prod);
    }
    
//    public double getTotalPrice(Product prod){
//        double tempTotal;
//        double tempPrice = prod.getPrice();
//        double tempQty = (double) cart.getQty(prod);
//        
//        tempTotal = tempPrice * tempQty;
//        
//        addToCartTotal(tempTotal);
//        
//        return tempTotal;
//    }
    
    public double getProdSubtotal (Product prod){
        double subtotal;
        double price = prod.getPrice();
        double qty = (double) cart.getQty(prod);
        
        subtotal = price * qty;
        
        return subtotal;
    }    
    private void addToCartTotal(Product prod){
        double subtotal = prod.getPrice();
        double temp = cartTotal + subtotal;
        setCartTotal(temp);
    }
    
    private void substractFromCartTotal(Product prod){
        double subtotal = getProdSubtotal(prod);
        double temp = cartTotal - subtotal;
        setCartTotal(temp);
    }

    public double getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(double cartTotal) {
        this.cartTotal = cartTotal;
    }
    
    
    
    

    /*
    public String getContents() {
        productList = cart.getContents().stream().distinct().collect(Collectors.toList());
        return "shoppingCart";
    }
     */
    public List<Product> getProductList() {
        return productList;
    }

//    public Map getProductList() {
//        return productList;
//    }
    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

//    public void setProductList(Map productList) {
//        this.productList = productList;
//    }
    public void addToCart(Product prod) {
        cart.add(prod);
        addToCartTotal(prod);
        cartService.update(sessionId, cart);
    }
    
    public void clearCart() {
        cart.removeAll();
        setCartTotal(0.0);
        cartService.update(sessionId, cart);
    }
    
    public void removeProduct(Product prod) {
        substractFromCartTotal(prod);
        cart.remove(prod);
        cartService.update(sessionId, cart);
    }
}

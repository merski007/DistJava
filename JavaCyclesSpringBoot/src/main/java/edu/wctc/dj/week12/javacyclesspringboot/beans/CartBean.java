package edu.wctc.dj.week12.javacyclesspringboot.beans;

import edu.wctc.dj.week12.javacyclesspringboot.model.Product;
import edu.wctc.dj.week12.javacyclesspringboot.model.ShoppingCart;
import edu.wctc.dj.week12.javacyclesspringboot.service.ShoppingCartService;
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
        return "shoppingCart";
    }

    public int getQty(Product prod) {
        return cart.getQty(prod);
    }

    public double getProdSubtotal(Product prod) {
        double subtotal;
        double price = prod.getPrice();
        double qty = (double) cart.getQty(prod);

        subtotal = price * qty;

        return subtotal;
    }

    private void addToCartTotal(Product prod) {
        double subtotal = prod.getPrice();
        double temp = cartTotal + subtotal;
        setCartTotal(temp);
    }

    private void substractFromCartTotal(Product prod) {
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

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

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

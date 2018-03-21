package edu.wctc.dj.week6.javacyclesjsf.beans;

import edu.wctc.dj.week6.javacyclesjsf.model.Product;
import edu.wctc.dj.week6.javacyclesjsf.model.ShoppingCart;
import edu.wctc.dj.week6.javacyclesjsf.model.ShoppingCartService;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.context.FacesContext;

@Named(value = "cartBean")
@SessionScoped
public class CartBean implements Serializable {

    private final String sessionId;
    private final ShoppingCart cart;
    private final ShoppingCartService cartService = new ShoppingCartService();
    private List<Product> shoppingCart;

    public CartBean() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        sessionId = facesContext.getExternalContext().getSessionId(true);

        cart = cartService.getContents(sessionId);
    }

    public int getItemsInCart() {
        return cart.getItemsInCart();
    }

    public String getContents() {
        shoppingCart = cart.getContents();
        //shoppingCart = (List<Product>) cartService.getContents(sessionId);
        return "shoppingCart";
    }

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Product> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addToCart(Product prod) {
        cart.add(prod);
        cartService.update(sessionId, cart);
    }
}

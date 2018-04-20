package edu.wctc.dj.week12.javacyclesspringboot.beans;

import edu.wctc.dj.week12.javacyclesspringboot.model.Product;
import edu.wctc.dj.week12.javacyclesspringboot.service.ProductService;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("productBean")
@Scope("session")
public class ProductBean implements Serializable {

    @Autowired
    private ProductService productService;
    private Product product;
    private List<Product> prodList;

    public ProductBean() {
    }

    public String allProducts() throws Exception {
        prodList = productService.getAllProducts();
        return "productList";
    }

    public String allLikeProducts(String type) throws Exception {
        prodList = productService.getAllLikeProducts(type);
        return "productList";
    }

    public void productDetail(AjaxBehaviorEvent event) {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("productDetail.xhtml?id=" + product.getProdId());
        } catch (IOException ex) {
            FacesMessage msg = new FacesMessage("IOException", product.getProdId());
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProdList() {
        return prodList;
    }

    public void setProdList(List<Product> prodList) {
        this.prodList = prodList;
    }

}

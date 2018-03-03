package edu.wctc.dj.week6.javacyclesjsf.beans;

import edu.wctc.dj.week6.javacyclesjsf.model.Product;
import edu.wctc.dj.week6.javacyclesjsf.model.ProductService;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;

@Named(value = "productBean")
@SessionScoped
public class ProductBean implements Serializable {

    private final ProductService productService = new ProductService();
    private Product product;
    private List<Product> productList;

    public ProductBean() {
    }

    public String allProducts() {
        productList = productService.getAllProducts();
        return "productList";
    }
    
    public String allLikeProducts(String type){
        productList = productService.getAllLikeProducts(type);
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

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

}

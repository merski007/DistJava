package edu.wctc.dj.week10.javacyclesjsf.beans;

import edu.wctc.dj.week10.javacyclesjsf.model.Product;
import edu.wctc.dj.week10.javacyclesjsf.service.ProductService;
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

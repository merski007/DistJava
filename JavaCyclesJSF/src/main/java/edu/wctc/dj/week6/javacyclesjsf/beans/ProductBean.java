package edu.wctc.dj.week6.javacyclesjsf.beans;

import edu.wctc.dj.week6.javacyclesjsf.model.Product;
import edu.wctc.dj.week6.javacyclesjsf.model.ProductService;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value = "productBean")
@SessionScoped
public class ProductBean implements Serializable {

    private final ProductService ps = new ProductService();
    private Product p;
    private List<Product> pList;

    public ProductBean() {
    }
    
    public String allProducts(){
        pList = ps.getAllProducts();
        return "pList";
    }

    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }

    public List<Product> getpList() {
        return pList;
    }

    public void setpList(List<Product> pList) {
        this.pList = pList;
    }
    
    
    
}

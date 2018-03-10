package edu.wctc.dj.week6.javacyclesjsf.beans;

import edu.wctc.dj.week6.javacyclesjsf.model.LineItem;
import edu.wctc.dj.week6.javacyclesjsf.model.Product;
import edu.wctc.dj.week6.javacyclesjsf.model.ProductService;
import edu.wctc.dj.week6.javacyclesjsf.model.ShoppingCart;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

@Named(value = "shoppingCartBean")
@Dependent
public class ShoppingCartBean {
    
    private ShoppingCart sc = new ShoppingCart("1");
    private ProductService prodService = new ProductService();
    private List<LineItem> lineItemList;
    private LineItem lineItem; 
    
    public ShoppingCartBean() {
    }
    
    public void addLineItem(String id, int qty){
        sc.addLineItem(prodService.getProduct(id), qty);
    }
    
    public String allLineItems(){
        lineItemList = sc.getLineItemArrayList();
        return "shoppingCart";
    }

    public ShoppingCart getSc() {
        return sc;
    }

    public void setSc(ShoppingCart sc) {
        this.sc = sc;
    }

    public ProductService getProdService() {
        return prodService;
    }

    public void setProdService(ProductService prodService) {
        this.prodService = prodService;
    }

    public List<LineItem> getLineItemList() {
        return lineItemList;
    }

    public void setLineItemList(List<LineItem> lineItemList) {
        this.lineItemList = lineItemList;
    }

    public LineItem getLineItem() {
        return lineItem;
    }

    public void setLineItem(LineItem lineItem) {
        this.lineItem = lineItem;
    }
    
    
    
}

package edu.wctc.dj.week10.javacyclesjsf.service;

import edu.wctc.dj.week10.javacyclesjsf.data.ProductDAO;
import edu.wctc.dj.week10.javacyclesjsf.model.Product;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductService {

    public Product getProduct(String prodId) {
        /*
        Product product = null;
        for (Product prod : productList) {
            if (prod.getProdId().equals(prodId)) {
                product = prod;
            }
        }
         */

        // TODO
        Product product = null;
        return product;
    }

    public List<Product> getAllProducts() throws Exception {
        ProductDAO productDao = new ProductDAO();
        List<Product> productList = productDao.getProducts();
        return productList;
    }

    public List<Product> getAllLikeProducts(String type) throws Exception {
        ProductDAO productDao = new ProductDAO();
        List<Product> productList = productDao.getLikeProducts(type);
        return productList;
    }

}

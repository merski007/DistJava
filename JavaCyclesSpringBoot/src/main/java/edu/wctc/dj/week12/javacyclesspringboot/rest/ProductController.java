package edu.wctc.dj.week12.javacyclesspringboot.rest;

import edu.wctc.dj.week12.javacyclesspringboot.model.Product;
import edu.wctc.dj.week12.javacyclesspringboot.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    
    @RequestMapping(method = GET, path = "/products")
    public List<Product> getProductList() throws Exception{
        return productService.getAllProducts();
    }
    
    @RequestMapping(method = GET, path = "/products/{id}")
    public Product getProduct(@PathVariable String id){
        Product product = productService.getProduct(id);
        return product;
    }
    
    
}

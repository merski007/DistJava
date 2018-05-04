package edu.wctc.dj.week12.javacyclesspringboot.rest;

import edu.wctc.dj.week12.javacyclesspringboot.model.Product;
import edu.wctc.dj.week12.javacyclesspringboot.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
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
    
    @RequestMapping(method = POST, path = "/products")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
    
    @RequestMapping(method = PUT, path = "/products")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }
    
    @RequestMapping(method = DELETE, path = "/products/{id}")
    public void deleteProduct(@PathVariable String id){
        productService.deleteProduct(id);
    }
    
}

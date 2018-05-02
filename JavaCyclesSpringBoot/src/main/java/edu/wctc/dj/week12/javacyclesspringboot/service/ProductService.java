package edu.wctc.dj.week12.javacyclesspringboot.service;

import edu.wctc.dj.week12.javacyclesspringboot.data.dao.IProductDAO;
import edu.wctc.dj.week12.javacyclesspringboot.model.Product;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.startsWith;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private IProductDAO productDao;

    public Product getProduct(String id) {
        return productDao.getOne(id);
    }

    public List<Product> getAllProducts() throws Exception {
        return productDao.findAll();
    }

    public List<Product> getAllLikeProducts(String type) throws Exception {
        // TODO, starts areound 1:50:55 mark in the video
        //ExampleMatcher matcher = ExampleMatcher.matching().withMatcher(type, startsWith().ignoreCase());
//        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("type", startsWith().ignoreCase());
//
//        Product product = new Product();
//        product.setType(type);
//        return productDao.findAll(Example.of(product, matcher));
        return productDao.findByType(type);
    }

}

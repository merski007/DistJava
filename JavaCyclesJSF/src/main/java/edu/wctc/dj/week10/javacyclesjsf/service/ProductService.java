package edu.wctc.dj.week10.javacyclesjsf.service;

import edu.wctc.dj.week10.javacyclesjsf.data.dao.IProductDAO;
import edu.wctc.dj.week10.javacyclesjsf.model.Product;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {
    
    @Autowired
    private IProductDAO productDao;

    public Product getProduct(String prodId) {
        // TODO
        return null;
    }

    public List<Product> getAllProducts() throws Exception {
        // TODO
        return productDao.findAll();
    }

    public List<Product> getAllLikeProducts(String type) throws Exception {
        // TODO
        return null;
    }

}

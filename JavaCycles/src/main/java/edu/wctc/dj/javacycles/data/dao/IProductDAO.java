package edu.wctc.dj.javacycles.data.dao;

import edu.wctc.dj.javacycles.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductDAO extends JpaRepository<Product, String> {
    
}

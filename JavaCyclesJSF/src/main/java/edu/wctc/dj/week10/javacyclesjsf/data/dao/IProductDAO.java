package edu.wctc.dj.week10.javacyclesjsf.data.dao;

import edu.wctc.dj.week10.javacyclesjsf.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductDAO extends JpaRepository<Product, String> {
    
}

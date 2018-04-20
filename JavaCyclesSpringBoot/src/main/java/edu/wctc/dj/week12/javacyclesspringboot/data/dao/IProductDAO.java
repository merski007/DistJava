package edu.wctc.dj.week12.javacyclesspringboot.data.dao;

import edu.wctc.dj.week12.javacyclesspringboot.model.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductDAO extends JpaRepository<Product, String> {
    List<Product> findByType(String type);
}

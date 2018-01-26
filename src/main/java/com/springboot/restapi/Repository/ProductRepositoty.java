package com.springboot.restapi.Repository;

import com.springboot.restapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by gracegao on 1/14/17.
 */
@Repository
public interface ProductRepositoty extends JpaRepository<Product, String> {

}

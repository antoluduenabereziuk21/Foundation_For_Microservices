package com.antolube20.products_services.repositories;

import com.antolube20.products_services.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}

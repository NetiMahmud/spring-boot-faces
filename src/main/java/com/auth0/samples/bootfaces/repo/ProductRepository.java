package com.auth0.samples.bootfaces.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth0.samples.bootfaces.model.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

package com.auth0.samples.bootfaces.controller;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.auth0.samples.bootfaces.model.entity.Product;
import com.auth0.samples.bootfaces.repo.ProductRepository;

import lombok.Getter;

@Scope(value = "session")
@Component
@ELBeanName(value = "productController")
@Join(path = "/product", to = "/product-form.jsf")
public class ProductController {

	@Autowired
	private ProductRepository productRepo;
	
	@Getter
	private Product product = new Product();
	
	public String save() {
		productRepo.save(product);
		product = new Product();
		return "/product-list.xhtml?faces-redirect=true";
	}
	
}

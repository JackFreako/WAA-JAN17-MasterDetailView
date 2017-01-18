package edu.mum.masterdetailview.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.masterdetailview.domain.Product;
import edu.mum.masterdetailview.domain.repository.ProductRepository;
import edu.mum.masterdetailview.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
		return this.productRepository.getAllProducts();	
	}

	public Product getProductById(String id) {
		return this.productRepository.getProductById(id);
	}

}

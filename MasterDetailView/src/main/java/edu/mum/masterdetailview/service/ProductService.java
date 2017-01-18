package edu.mum.masterdetailview.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.mum.masterdetailview.domain.Product;

public interface ProductService {
	List <Product> getAllProducts(); 	
	Product getProductById(String id);
}

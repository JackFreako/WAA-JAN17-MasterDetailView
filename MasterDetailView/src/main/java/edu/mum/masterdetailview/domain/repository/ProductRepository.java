package edu.mum.masterdetailview.domain.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.mum.masterdetailview.domain.Product;


public interface ProductRepository {
	List <Product> getAllProducts();
	Product getProductById(String productID);
}

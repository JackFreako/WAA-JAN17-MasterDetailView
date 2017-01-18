/**
 * 
 */
package edu.mum.masterdetailview.controller;

import java.io.File;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import edu.mum.masterdetailview.domain.Product;
import edu.mum.masterdetailview.service.ProductService;

/**
 * @author yared
 *
 */
@Controller
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
		
	@RequestMapping
	public String list(Model model) {					
		List<Product> products = productService.getAllProducts();		
		model.addAttribute("products", products);
		return "products";
	}
	
	@RequestMapping("/all")
	public String allProducts(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "products";
	}
	
	
	@RequestMapping("/product")
	public String getProductById(@RequestParam("id")String productId, Model model) {
		model.addAttribute("product",productService.getProductById(productId));
		return "product";
	}
	

}

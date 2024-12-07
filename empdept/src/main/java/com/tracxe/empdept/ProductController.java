package com.tracxe.empdept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracxe.dao.ProductDAO;
import com.tracxe.model.Product;

@RestController
public class ProductController {
	
	@Autowired
	private ProductDAO prodDAO;
//	@RequestMapping("show-prod")
//	public Product getProduct() {
//		return new Product();
//	}
	
//	@RequestMapping("show-prods")
	//public List<Product>getAllProducts() {
//		Product p=new Product();
//		List<Product> pList= new ArrayList<>();
//		pList.add(p);
//		p = new Product(1,"Laptop",45000);
//		pList.add(p);
//		p= new Product(2,"Mobile",25000);
//		pList.add(p);
//      return pList;
		//return prodDAO.getAllProducts();
	@RequestMapping("getProductById/{ID}")
	public Product 	getProductById(@PathVariable("ID")int id) {
		return prodDAO.getProductById(id);
		
	}
	@RequestMapping("getProductByName/{VARCHAR}")
	public Product 	getProductByName(@PathVariable("VARCHAR")String name) {
		return prodDAO.getProductByName(name);
		
	}
	@DeleteMapping("deleteProductById/{ID}")
	public String deleteProductById(@PathVariable("ID")int id) {
		return prodDAO.deleteProductById(id);
		
	}
	
	@PostMapping("registerProd")
	public Product registerProduct( @RequestBody Product product ) {
		return prodDAO.registerProduct(product);
			
	}
	@PutMapping("updateProd")
	public Product updateProduct( @RequestBody Product product ) {
		return prodDAO.updateProduct(product);
			
	}
	@PostMapping("updateProduct")
	public Product replaceProduct( @RequestBody Product product ) {
		return prodDAO.replaceProduct(product);
			
	}
}

package com.tracxe.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracxe.model.Product;

@Service
public class ProductDAO {
	@Autowired
	private ProductRepository prodRepo;
//	public List<Product> getAllProducts() {
//		return prodRepo.findAll();
//	}
	public Product getProductById(int id) { 
		return prodRepo.findById(id).orElse(new Product());
	}
	public Product getProductByName(String name) { 
		return prodRepo.findByName(name);
	}
	public String deleteProductById(int id) { 
		 prodRepo.deleteById(id);
		 return "Product with product id "+id+" is deleted.";
	}
	public Product registerProduct(Product prod) { 
		return prodRepo.save(prod);
	}
	public Product updateProduct(Product prod) { 
		return prodRepo.save(prod);
	}
	public Product replaceProduct(Product prod) {
		return prodRepo.save(prod);
	}
}



package com.pm.repository;

import com.pm.model.*;
import java.util.*;

public class MemoryRepository {

	private List<Product> products = new ArrayList<>();

	public void addProduct(Product product) {
		products.add(product);

	}
	
	public Product getProduct(int id){
		Product product = null;
		for(Product p : products){
			if(product.getId() == id){
				product = p;
			}
		}
		return product;
	}

	public void updateProduct(int id, int newPrice) {
		for (Product p : products) {

			if (p.getId() == id) {
				p.setPrice(newPrice);

			}

		}
	}

	public void delete(int id) {
		products.removeIf(item -> item.getId() == id);
	}

	

}

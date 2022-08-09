package com.ashokit.service;

import org.springframework.stereotype.Service;

import com.ashokit.exceptions.NoProductFoundException;
import com.ashokit.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Override
	public Product findProductById(Integer pid) {
		if(pid==101) {
			return new Product("101", "Keyboard", 800.00);
		} else {
			// throw Custom Exception
			throw new NoProductFoundException("No Product Found..!");
		}
	}

}
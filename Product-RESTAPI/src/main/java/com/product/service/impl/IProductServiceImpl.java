package com.product.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.product.domain.Product;
import com.product.dto.ProductDTO;
import com.product.exception.IdNotFoundException;
import com.product.service.IProductService;
@Service
public class IProductServiceImpl implements IProductService{
	
	
	
	 private static Map<Integer, Product> hardcodedProducts = new HashMap<>();

	    static {
	        // Adding hardcoded products
	        hardcodedProducts.put(1, new Product(1, "Mobile 1", 100.0));
	        hardcodedProducts.put(2, new Product(2, "Mobile 2", 150.0));
	        hardcodedProducts.put(3, new Product(3, "Laptop 1", 800.0));
	        hardcodedProducts.put(4, new Product(4, "Laptop 2", 1200.0));
	        hardcodedProducts.put(5, new Product(5, "Headphones 1", 50.0));
	        hardcodedProducts.put(6, new Product(6, "Headphones 2", 70.0));
	        hardcodedProducts.put(7, new Product(7, "Tablet 1", 200.0));
	        hardcodedProducts.put(8, new Product(8, "Tablet 2", 250.0));
	        hardcodedProducts.put(9, new Product(9, "Camera 1", 300.0));
	        hardcodedProducts.put(10, new Product(10, "Camera 2", 400.0));
	    }

		@Override
	    public ProductDTO getProductById(Integer id) {
	        if (hardcodedProducts.containsKey(id)) {
	            Product product = hardcodedProducts.get(id);
	            ProductDTO dto = new ProductDTO();
	            BeanUtils.copyProperties(product, dto);
	            return dto;
	        }

	        throw new IdNotFoundException("Id not found " + id);
	    }

	@Override
	public List<ProductDTO> getAllProducts() {
        List<Product> hardcodedProducts = createHardcodedProducts();
        List<ProductDTO> dtos = new ArrayList<>();
        for (Product entity : hardcodedProducts) {
            ProductDTO dto = new ProductDTO();
            BeanUtils.copyProperties(entity, dto);
            dtos.add(dto);
        }
        return dtos;
    }

    private List<Product> createHardcodedProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Mobile 1", 100.0));
        products.add(new Product(2, "Mobile 2", 150.0));
        products.add(new Product(3, "Laptop 1", 800.0));
        products.add(new Product(4, "Laptop 2", 1200.0));
        products.add(new Product(5, "Headphones 1", 50.0));
        products.add(new Product(6, "Headphones 2", 70.0));
        products.add(new Product(7, "Tablet 1", 200.0));
        products.add(new Product(8, "Tablet 2", 250.0));
        products.add(new Product(9, "Camera 1", 300.0));
        products.add(new Product(10, "Camera 2", 400.0));
        return products;
    }
}



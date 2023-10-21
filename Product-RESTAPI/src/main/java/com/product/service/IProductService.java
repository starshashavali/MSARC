package com.product.service;

import java.util.List;

import com.product.dto.ProductDTO;

public interface IProductService {
	
	
	public ProductDTO getProductById(Integer id);
	
	public List<ProductDTO> getAllProducts();

}

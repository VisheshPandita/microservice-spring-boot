package com.microservice.ProductService.service;

import com.microservice.ProductService.model.ProductRequest;
import com.microservice.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductbyId(long productId);
}

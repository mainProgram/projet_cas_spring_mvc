package com.groupeisi.cas.service;

import com.groupeisi.cas.dto.ProductDto;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    Optional<List<ProductDto>> findAll();

    boolean save(ProductDto productDto);
}

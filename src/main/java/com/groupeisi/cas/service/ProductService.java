package com.groupeisi.cas.service;

import com.groupeisi.cas.dao.IProductDao;
import com.groupeisi.cas.dao.ProductDao;
import com.groupeisi.cas.dto.ProductDto;
import com.groupeisi.cas.entity.ProductEntity;
import com.groupeisi.cas.mapper.ProductMapper;

import java.util.List;
import java.util.Optional;

public class ProductService implements IProductService{

    private IProductDao productDao = new ProductDao();

    @Override
    public Optional<List<ProductDto>> findAll() {
        List<ProductEntity> productEntityList = productDao.list(new ProductEntity());

        return Optional.of(ProductMapper.toListProductDto(productEntityList));
    }

    @Override
    public boolean save(ProductDto productDto) {
        return productDao.save(ProductMapper.toProductEntity(productDto));
    }

}

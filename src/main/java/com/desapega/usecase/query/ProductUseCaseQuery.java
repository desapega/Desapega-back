package com.desapega.usecase.query;

import com.desapega.infra.models.Product;

import java.util.List;

public interface ProductUseCaseQuery {

    public List<Product> findAllProducts();
}

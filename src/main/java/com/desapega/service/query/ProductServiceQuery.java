package com.desapega.service.query;

import com.desapega.infra.models.Product;
import com.desapega.infra.repositories.ProductRepository;
import com.desapega.usecase.query.ProductUseCaseQuery;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.desapega.domains.message.ProductMessage.PRODUCT_NOT_FOUND_EXCEPTION;

@Service
public class ProductServiceQuery implements ProductUseCaseQuery {

    private final ProductRepository productRepository;

    public ProductServiceQuery(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAllProducts() {
        List<Product> products = productRepository.findAll();
        if (products.isEmpty()) {
            throw new RuntimeException(PRODUCT_NOT_FOUND_EXCEPTION);
        }
        return products;
    }
}

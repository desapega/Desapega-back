package com.desapega.rest.query;

import com.desapega.infra.models.Product;
import com.desapega.usecase.query.ProductUseCaseQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResourceQuery {

    private ProductUseCaseQuery productUseCaseQuery;

    public ProductResourceQuery(ProductUseCaseQuery productUseCaseQuery) {
        this.productUseCaseQuery = productUseCaseQuery;
    }

    @GetMapping
    private ResponseEntity<List<Product>> findAllProducts(){
        List<Product> allProducts = productUseCaseQuery.findAllProducts();
        return ResponseEntity.ok().body(allProducts);
    }
}

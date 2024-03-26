package com.warehouse.warehousemediasoft.controllers;

import com.warehouse.warehousemediasoft.core.SourceRepository;
import com.warehouse.warehousemediasoft.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ControllerREST {

    private final SourceRepository productRepository;

    public ControllerREST(SourceRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public void storePurchase(@RequestBody Product product) {
        productRepository.storeProduct(product);
    }

    @GetMapping
    public List<Product> findPurchases() {
        return productRepository.findAllPurchases();
    }
}

package com.warehouse.warehousemediasoft.services;

import com.warehouse.warehousemediasoft.core.ProductService;
import com.warehouse.warehousemediasoft.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WarehouseProductService extends ProductService {
    private final List<Product> products = new ArrayList<>();
    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> findAll() {
        return products;
    }

    public void changePrice(int id){

    }
}

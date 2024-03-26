package com.warehouse.warehousemediasoft.core;

import com.warehouse.warehousemediasoft.models.Product;

import java.util.List;

public abstract class ProductService {

    public abstract void addProduct(Product p);

    public abstract List<Product> findAll();

    public abstract void changePrice(int id);
}

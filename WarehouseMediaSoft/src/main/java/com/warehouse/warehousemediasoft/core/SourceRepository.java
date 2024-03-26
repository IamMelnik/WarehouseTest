package com.warehouse.warehousemediasoft.core;

import com.warehouse.warehousemediasoft.models.Product;

import java.util.List;

public abstract class SourceRepository {
    public abstract void storeProduct(Product product);

    public abstract List<Product> findAllPurchases();

}

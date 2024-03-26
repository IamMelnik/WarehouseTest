package com.warehouse.warehousemediasoft.core;

import com.warehouse.warehousemediasoft.models.Description;
import com.warehouse.warehousemediasoft.models.Product;
import lombok.Getter;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ProductBuilder {

    @Getter
    private final Product product;

    public ProductBuilder(){
        product = new Product();
    }

    public ProductBuilder setId(){
        product.setId(Product.getCounter());
        return this;
    }

    public ProductBuilder setId(int id){
        product.setId(id);
        return this;
    }

    public ProductBuilder setName(String name){
        product.setName(name);
        return this;
    }

    public ProductBuilder setCount(int count) {
        product.setCount(count);
        return this;
    }

    public ProductBuilder setCategory(String category){
        product.setCategory(category);
        return this;
    }

    public ProductBuilder setPrice(BigDecimal price){
        product.setPrice(price);
        return this;
    }

    public ProductBuilder setDescription(Description description) {
        product.setDescription(description);
        return this;
    }

    public ProductBuilder setDescription(String description) {
        product.setDescription(description);
        return this;
    }
}

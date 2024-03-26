package com.warehouse.warehousemediasoft.controllers;

import com.warehouse.warehousemediasoft.core.ProductBuilder;
import com.warehouse.warehousemediasoft.core.ProductService;
import com.warehouse.warehousemediasoft.models.Description;
import com.warehouse.warehousemediasoft.models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Controller
public class ControllerMVC {

    ProductService productService;

    public String addProduct(
            @RequestParam String name,
            @RequestParam BigDecimal price,
            @RequestParam String info,
            @RequestParam int count,
            @RequestParam String category,
            Model model
    ) {

        ProductBuilder productBuilder = new ProductBuilder();
        productBuilder.setId(Product.incrementCounter())
                .setName(name)
                .setCategory(category.intern())
                .setPrice(price)
                .setCount(count)
                .setDescription(new Description(info));

        Product product = productBuilder.getProduct();
        productService.addProduct(product);
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }


}

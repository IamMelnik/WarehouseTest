package com.warehouse.warehousemediasoft.repositories;

import com.warehouse.warehousemediasoft.core.ProductBuilder;
import com.warehouse.warehousemediasoft.core.SourceRepository;
import com.warehouse.warehousemediasoft.models.Description;
import com.warehouse.warehousemediasoft.models.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public class ProductRepository extends SourceRepository {

    private final JdbcTemplate jdbc;

    public ProductRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void storeProduct(Product product) {
        String sql = "INSERT INTO purchase VALUES (NULL, ?, ?)";
        jdbc.update(sql, Product.incrementCounter(), product.getPrice());
    }

    public List<Product> findAllPurchases() {
        String sql = "SELECT * FROM purchase";

        RowMapper<Product> purchaseRowMapper = (r, i) -> {
            ProductBuilder productBuilder = new ProductBuilder();
            productBuilder.setId(r.getInt("id"))
                    .setName(r.getString("name"))
                    .setCategory(r.getString("category").intern())
                    .setPrice(r.getBigDecimal("price"))
                    .setCount(r.getInt("count"))
                    .setDescription(new Description(r.getString("info"),
                            r.getDate("creation_date"),
                            r.getDate("last_update")));
            Product rowObject = new Product();
            return rowObject;
        };

        return jdbc.query(sql, purchaseRowMapper);
    }
}

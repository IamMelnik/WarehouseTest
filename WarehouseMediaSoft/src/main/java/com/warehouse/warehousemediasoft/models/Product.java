package com.warehouse.warehousemediasoft.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.xml.transform.sax.SAXResult;
import java.math.BigDecimal;
import java.math.BigInteger;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private static Integer idCounter = 0;

    @Id
    private int id;
    private String name;
    private String category;
    private BigDecimal price;
    private int count;
    private Description description;

    public static Integer getCounter(){
        return idCounter;
    }

    public static Integer incrementCounter(){
        return  ++idCounter;
    }

    public static Integer decrementCounter(){
        return  --idCounter;
    }

    public void setDescription(Description description){
        this.description = description;
    }
    public void setDescription(String info){
        description = new Description(info);
    }
}

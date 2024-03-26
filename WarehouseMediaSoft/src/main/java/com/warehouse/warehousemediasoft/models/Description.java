package com.warehouse.warehousemediasoft.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class Description {

    private String info;
    private final Date creationDate;
    private Date updateDate;

    public Description(){
        info="";
        creationDate = new Date();
        updateDate = new Date();
    }

    public Description(String description){
        this.info=description;
        creationDate = new Date();
        updateDate = new Date();
    }

    public void setInfo(String info){
        this.info = info;
    }

    public void setUpdateDate(){
        updateDate = new Date();
    }

}

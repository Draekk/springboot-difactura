package com.draekk.curso.springboot.di.factura.springbootdifactura.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {

    private Product product;
    private Integer quantity;
    
}

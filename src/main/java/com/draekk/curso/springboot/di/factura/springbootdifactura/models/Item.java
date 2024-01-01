package com.draekk.curso.springboot.di.factura.springbootdifactura.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Item {

    private Product product;
    private Integer quantity;

    public Integer getTotal() {
        return this.product.getPrice() * this.quantity;
    }
    
}

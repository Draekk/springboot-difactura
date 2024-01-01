package com.draekk.curso.springboot.di.factura.springbootdifactura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class Invoice {

    @Autowired
    private Client client;

    @Value("${invoice.description}")
    private String description;

    @Autowired
    private List<Item> items;

    public Integer getTotal() {
        /* 
         * Paso a paso de la implementación de la función getTotal():
         * 1. items.stream() -> Se convierte la lista de items en un stream
         * 2. mapToInt(item -> item.getTotal()) -> Se mapea cada item a su total
         * 3. sum() -> Se suman todos los totales
         */
        return items.stream().mapToInt(item -> item.getTotal()).sum();
    }
}

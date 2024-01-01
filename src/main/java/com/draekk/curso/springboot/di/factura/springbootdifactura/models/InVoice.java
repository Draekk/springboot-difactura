package com.draekk.curso.springboot.di.factura.springbootdifactura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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
    @Qualifier("itemsInvoiceOffice")
    private List<Item> items;

    public Invoice() {
        System.out.println("Creando el componente de la factura desde el constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("Creando el componente de la factura");
        client.setName(client.getName().concat(" ").concat("'Draekk'"));
        description = description.concat(" del cliente: ").concat(client.getName().concat(" ").concat(client.getLastname()));
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Factura destruida. ".concat(description));
    }

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

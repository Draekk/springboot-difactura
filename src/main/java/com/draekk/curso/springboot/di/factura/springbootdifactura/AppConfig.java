package com.draekk.curso.springboot.di.factura.springbootdifactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.draekk.curso.springboot.di.factura.springbootdifactura.models.Item;
import com.draekk.curso.springboot.di.factura.springbootdifactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

    @Bean("itemsInvoice")
    List<Item> itemsInvoice() {
        return Arrays.asList(
                new Item(new Product("Camara Sony", 100), 2),
                new Item(new Product("Bicicleta Bianchi aro 26", 1200), 4));
    }

    @Bean("itemsInvoiceOffice")
    List<Item> itemsInvoiceOffice() {
        return Arrays.asList(
                new Item(new Product("Monitor LG LCD 24", 250), 2),
                new Item(new Product("Notebook Asus", 500), 1),
                new Item(new Product("Impresora HP Multifuncional", 80), 1),
                new Item(new Product("Escritorio Oficina", 300), 1));
    }

}

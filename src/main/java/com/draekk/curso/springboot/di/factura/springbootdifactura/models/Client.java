package com.draekk.curso.springboot.di.factura.springbootdifactura.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class Client {

    @Value("${client.name}")
    private String name;

    @Value("${client.lastname}")
    private String lastname;

}

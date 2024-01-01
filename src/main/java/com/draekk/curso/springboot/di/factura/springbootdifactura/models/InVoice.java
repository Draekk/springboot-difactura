package com.draekk.curso.springboot.di.factura.springbootdifactura.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InVoice {

    private Client client;
    private String description;
    private List<Item> items;
}

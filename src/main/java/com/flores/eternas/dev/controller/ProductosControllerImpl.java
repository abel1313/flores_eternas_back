package com.flores.eternas.dev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productos")
public class ProductosControllerImpl {
    @GetMapping
    public String getProductos(){
        return "hellow amigop";
    }

}

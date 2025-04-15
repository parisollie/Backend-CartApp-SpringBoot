package com.pjff.backend.cartapp.backend_cartapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjff.backend.cartapp.backend_cartapp.models.Product;
import com.pjff.backend.cartapp.backend_cartapp.services.ProductService;

//@RestController, nos va a devolver un JSON o xml datos y esta compuesta por estas 2 cosas 
@RestController
/*
 * Paso 12.5, para evitar el error de core al conectar el backend con la app de
 * React, se produce porque estamos en diferentes dominios.
 */
@CrossOrigin(origins = "http://localhost:5173")
// Paso 9, creamos el ProductController
public class ProductController {

    // Inyectamos porque necesitamos el ProductService
    @Autowired
    private ProductService service;

    // Con GetMapping ponemos la ruta para recuperar los datos de los productos
    @GetMapping("/products")
    // devuelve una lista
    public List<Product> list() {
        // devuelve la lista de productos y lo convierte a JSON
        return service.findAll();
    }
}

package com.pjff.backend.cartapp.backend_cartapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjff.backend.cartapp.backend_cartapp.models.Product;
import com.pjff.backend.cartapp.backend_cartapp.services.ProductService;

//Paso 5,@RestController, nos va a devolver u json o xml datos y esta compuesta por 2
// cosas 
@RestController
// Vid 176, para evitar el error de core al conectar el bakcend con la app.
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

    // Inyectamos por necesitamos el Product service
    @Autowired
    private ProductService service;

    // get ponemos la ruta para recuperar los datos
    @GetMapping("/products")
    // devuelve una lista
    public List<Product> list() {
        // devuelve la lista de productos y lo convierte a json
        return service.findAll();
    }
}

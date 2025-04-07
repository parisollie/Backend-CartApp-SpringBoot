package com.pjff.backend.cartapp.backend_cartapp.services;

import java.util.List;

import com.pjff.backend.cartapp.backend_cartapp.models.Product;

//Paso 3, creamos la interfaz
public interface ProductService {
    // Vid 153 tenemos un metodo que devuelve una lista de productos y devuelve
    // findall, devuelve varios registros
    List<Product> findAll();
}

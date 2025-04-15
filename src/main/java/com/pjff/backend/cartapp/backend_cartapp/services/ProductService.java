package com.pjff.backend.cartapp.backend_cartapp.services;

import java.util.List;
import com.pjff.backend.cartapp.backend_cartapp.models.Product;

//Paso 3, creamos la interfaz
public interface ProductService {
    /*
     * paso 4 tenemos un método que devuelve una lista de productos y devuelve
     * findall, devuelve varios registros
     */
    List<Product> findAll();
}

package com.pjff.backend.cartapp.backend_cartapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pjff.backend.cartapp.backend_cartapp.models.Product;

/*Vid 152, Paso 2,creamos el ProductRepository, exportamos nuestra clase entity 
y el tipo de la llave primaria*/
public interface ProductRepository extends CrudRepository<Product, Long> {
}
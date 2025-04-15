package com.pjff.backend.cartapp.backend_cartapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pjff.backend.cartapp.backend_cartapp.models.Product;
import com.pjff.backend.cartapp.backend_cartapp.repositories.ProductRepository;

//Para que sea un componente spring lo debemos anotar con Service, es una clase de servicio.
@Service
// V-153,Paso 5,implementamos ProductsServiceImpl
public class ProductServiceImpl implements ProductService {

    // Paso 6 Inyectamos el repositorio con @Autowired
    @Autowired
    private ProductRepository repository;

    // Sobreescribimos, @Override
    @Override
    /*
     * V-154,paso 8,ponemos Transactional, para hacer una sincronizacion con la BD
     * aqui solo será lectura, todo los metodos que sean lecturas solo llevan
     * readOnly
     */
    @Transactional(readOnly = true)

    // Paso 7 Paso devuelve un método que devuelve varios registros
    public List<Product> findAll() {
        /*
         * el findAll devuelve un tipo iterable de producto
         * asi que hacemos un cast de lista de productos
         */
        return (List<Product>) repository.findAll();
    }
}

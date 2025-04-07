package com.pjff.backend.cartapp.backend_cartapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pjff.backend.cartapp.backend_cartapp.models.Product;
import com.pjff.backend.cartapp.backend_cartapp.repositories.ProductRepository;

//Para que sea un componente spring lo debemos anotar con Service, es una clase de servicio.
@Service
// Paso 4,implementamos Products service
public class ProductServiceImpl implements ProductService {

    // Inyectamos el repositorio con @Autowired
    @Autowired
    private ProductRepository repository;

    // Sobreescribimos, @Override
    @Override
    // Vid 154,ponemos Transactional, para hacer una sincronizacion con la bd
    // aqui solo sera lectura.
    @Transactional(readOnly = true)
    //
    public List<Product> findAll() {
        // el findAll devuelce un tipo iterable de producto
        // asi que hacemos un cast de lista de productos
        return (List<Product>) repository.findAll();
    }
}

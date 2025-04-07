package com.pjff.backend.cartapp.backend_cartapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Vid 150,Paso 1 de entity es de clase de persitencia mapeada a la base de datos
@Entity
// La tabla de nuestra base de datos
@Table(name = "products")
public class Product {

    @Id
    // para que se genere un id automatico identity para mysql
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Toda clase Entity tiene que tener un id ,una llave primaria
    private Long id;

    private String name;

    private String description;

    private Long price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

}
